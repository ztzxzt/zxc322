package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_business_area extends AppCompatActivity {
    CardView coffeeCard,carCard,onlineShopCard,restaurantCard,franchiseCard,readyBusinessCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_area);
        coffeeCard = findViewById(R.id.coffeeCardView);
        coffeeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),coffee_house_activity.class);
                startActivity(intent);
            }
        });
    }



}