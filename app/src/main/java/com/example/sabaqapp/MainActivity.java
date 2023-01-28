package com.example.sabaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addstd=findViewById(R.id.button);
        Button allStd=findViewById(R.id.button2);
        Button stdHistory=findViewById(R.id.button3);

        addstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(MainActivity.this,AddStudent.class);
                startActivity(inten);
            }
        });

        allStd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(inten);
            }
        });
        stdHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}