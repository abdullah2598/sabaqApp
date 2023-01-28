package com.example.sabaqapp;

import android.widget.Toast;

import java.util.ArrayList;

public class StudentArray
{
    ArrayList<Student> stdArray=new ArrayList<>();

    public void AddStudent(Student s)
    {
        stdArray.add(s);
    }

    public  ArrayList<Student> getAllStd()
    {
        return  stdArray;
    }
}
