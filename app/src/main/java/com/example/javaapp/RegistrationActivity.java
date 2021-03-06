package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //скрываем нижнюю панель навигации
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); // появляется поверх и исчезает
        setContentView(R.layout.activity_registration);
    }
    public void Confirm(View view) {
        Intent intent = new Intent(this, activity_business_area.class);
        startActivity(intent);
    }
}