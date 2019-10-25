package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView listView, priceVIew;
    String list_choice;
    Double price_aud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = (TextView) findViewById(R.id.listView);
        priceVIew = (TextView) findViewById(R.id.priceView);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_aud = bundle.getDouble("price");

        listView.setText(list_choice);
        priceVIew.setText(price_aud.toString());


    }
}
