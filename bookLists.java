package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class bookLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_lists);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}