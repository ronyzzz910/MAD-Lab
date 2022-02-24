package com.example.sjcet.intentchrome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_Explicit = (Button)findViewById(R.id.btn1);
        btn_Explicit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new
                        Intent(Intent.ACTION_VIEW,Uri.parse("https://www.chrome.com/"));
                startActivity(intent);
            }
        });
    }
}


