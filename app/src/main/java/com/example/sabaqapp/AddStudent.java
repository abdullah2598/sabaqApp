package com.example.sabaqapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        EditText txt1=findViewById(R.id.editTextTextPersonName);
        EditText txt2=findViewById(R.id.editTextTextPersonName2);
        Button addStudent=findViewById(R.id.addStudentToList);
        DBHelper d=new DBHelper(this);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String name=txt1.getText().toString();
                String age=txt2.getText().toString();

                Boolean b=d.insertStd("adnan","12");
                //if(b)
                {
                    Toast.makeText(AddStudent.this, age.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}