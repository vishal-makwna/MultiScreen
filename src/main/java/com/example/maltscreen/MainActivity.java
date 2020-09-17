package com.example.maltscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.maltiscreen.ORDER";

    public void PlaceOrder(View view){
        Intent intent = new Intent(this, Order.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String massage = "Order "+ editText1.getText().toString() + ", "
                +editText2.getText().toString() + " & "
                + editText3.getText().toString() + " Successfully placed";
        intent.putExtra(MSG, massage);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}