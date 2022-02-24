package com.example.sjcet.backgroundcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1;
        final LinearLayout Layout;
        Layout = findViewById(R.id.l1);
        button1 = findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Layout.setBackgroundResource(android.R.color.holo_green_light);
            }
        });
    }
}
