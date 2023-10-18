package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class display_color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_color);

        RelativeLayout layout = findViewById(R.id.displayColorLayout);
        String colorName = getIntent().getStringExtra("colorName");

        int bgColor = Color.WHITE;
        if("Red".equals(colorName)) {
            bgColor = Color.RED;
        } else if ("Green".equals(colorName)) {
            bgColor = Color.GREEN;
        } else if ("Blue".equals(colorName)) {
            bgColor = Color.BLUE;
        }
        layout.setBackgroundColor(bgColor);
    }
}