package com.example.sabaqapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper
{

    public DBHelper(Context context ) {
        super(context, "sabaq.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table StudentRecord"+
                "(id int primary key autoincrement," +
                "stdname Text," +
                "parano Text," +
                "ayats Text," +
                "ayate Text," +
                "lastsabaq Text," +
                "manzil Text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP Table if exists StudentRecord");
    }

    public boolean insert(String stdname,String parano,String ayats,String ayate,String lastsabaq,String manzil) {
        SQLiteDatabase mydb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("stdname", stdname);
        contentValues.put("parano", parano);
        contentValues.put("ayats", ayats);
        contentValues.put("ayate", ayate);
        contentValues.put("lastsabaq", lastsabaq);
        contentValues.put("manzil", manzil);
        long result = mydb.insert("StudentRecord", null, contentValues);
        mydb.close();
        if(result==-1)
        {
            return  false;
        }
        return true;

    }

    // std record will be returned form here
//    public ArrayList<Student> getAllData()
//    {
//        ArrayList<Student> list=new ArrayList<>();
//        SQLiteDatabase mydb=this.getWritableDatabase()  ;
//        Cursor cursor=mydb.rawQuery("select question,answer1,answer2,answer3,answer4,correctAnswer from questionPaper",null);
//        if(cursor.moveToFirst())
//        {
//            while(cursor.moveToNext())
//            {
//                QuestionClass q=new QuestionClass();
//                q.setQuestionvalue(cursor.getString(0));
//                q.setOption1(cursor.getString(1));
//                q.setOption2(cursor.getString(2));
//                q.setOption3(cursor.getString(3));
//                q.setOption4(cursor.getString(4));
//                q.setCorrectOption(cursor.getString(5));
//
//                list.add(q);
//            }
//
//
//        }
//        cursor.close();
//        mydb.close();
//        return list;
//    }

}
