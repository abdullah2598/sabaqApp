package com.example.sabaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // this is for the when we add click add record

        Button homepagebac=findViewById(R.id.homepage);
        Button addStdInfo=findViewById(R.id.addstdinfo);
        EditText pararno=findViewById(R.id.parano);
        EditText ayats=findViewById(R.id.ayats);
        EditText ayate=findViewById(R.id.ayate);
        EditText lastSabaq=findViewById(R.id.lastsabaq);
        EditText manzil=findViewById(R.id.manzil);
        EditText date=findViewById(R.id.date);


        homepagebac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
        DBHelper dbHelper=new DBHelper(this);
        addStdInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=getIntent();
                String stdName=intent.getStringExtra("name");
                String paranoText=pararno.getText().toString();
                String ayatsText=ayats.getText().toString();
                String ayateText=ayate.getText().toString();
                String lastSabaqText=lastSabaq.getText().toString();
                String manzilText=manzil.getText().toString();
                String dateText=date.getText().toString();

                Boolean b=dbHelper.insert(stdName,paranoText,ayatsText,ayateText,lastSabaqText,manzilText,dateText);
                if(b)
                {
                    Toast.makeText(MainActivity3.this, "student record added", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity3.this, dateText.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}