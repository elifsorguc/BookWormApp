package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bookLists;
    private Button pastBooks;
    private Button favorites;
    private Button borrowed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookLists = findViewById(R.id.booklists_btn);
        bookLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bookLists.class);
                startActivity(intent);
            }
        });

        pastBooks = findViewById(R.id.pastBooks_btn);
        pastBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pastBooks.class);
                startActivity(intent);
            }
        });

        favorites = findViewById(R.id.favorites_btn);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, favorites.class);
                startActivity(intent);
            }
        });

        borrowed = findViewById(R.id.borrowedbooks_btn);
        borrowed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BorrowedBooks.class);
                startActivity(intent);
            }
        });


    }
}