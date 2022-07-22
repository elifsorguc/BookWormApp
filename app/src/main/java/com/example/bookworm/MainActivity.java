package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bookworm.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

    public static void main(String[] args) {
        System.out.println("elif");
        //hi
    }
}