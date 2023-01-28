package com.example.sabaqapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.viewHolder> {

    ArrayList<Student> list;
    Context context;
    //    create constructor of the both of the following will be used in the main class
    public StudentAdapter(ArrayList<Student> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        //        cardview (which is our layout) ko hum idher hi inflate kar lety ha

        TextView name;
        TextView age;
        Button btnaddRec;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            age = itemView.findViewById(R.id.Age);
            btnaddRec = itemView.findViewById(R.id.addrec);
        }
    }
}