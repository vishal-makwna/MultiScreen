package com.example.maltscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String massage = intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.OrderText);
        textView.setText(massage);

    }
}