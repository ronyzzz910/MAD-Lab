package com.example.sjcet.registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv =findViewById(R.id.textView1);
        tv1 =findViewById(R.id.textView2);
        tv2 =findViewById(R.id.textView3);
        tv3 =findViewById(R.id.textView4);
        tv4 =findViewById(R.id.textView5);
        tv5 =findViewById(R.id.textView6);
        tv6 =findViewById(R.id.textView7);
        Intent intent = getIntent();
        SharedPreferences mypref=getSharedPreferences("activity_main2.xml",0);
        String str = mypref.getString("fname",null);
        String str1 = mypref.getString("lname",null);
        String str2 = mypref.getString("gender",null);
        String str3 = mypref.getString("phone",null);
        String str4 = mypref.getString("pwd",null);
        String str5 = mypref.getString("email",null);
        String str6 = mypref.getString("dob",null);
        tv.setText(str);
        tv1.setText(str1);
        tv2.setText(str2);
        tv3.setText(str3);
        tv4.setText(str4);
        tv5.setText(str5);
        tv6.setText(str6);
    }
}
