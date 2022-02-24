package com.example.sjcet.change2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        TextView tv;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            tv = findViewById(R.id.tv);
        }

        public void change(View view) {
            tv.setText("Theresa Saji");
        }
    }
