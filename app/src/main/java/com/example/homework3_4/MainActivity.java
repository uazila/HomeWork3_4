package com.example.homework3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.first_fragment_container, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.two_fragment_container, new TwoFragment()).commit();
    }
}