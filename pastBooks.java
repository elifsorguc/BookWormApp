package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class pastBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_books);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}