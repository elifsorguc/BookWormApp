package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BorrowedBooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrowed_books);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}