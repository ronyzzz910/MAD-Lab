package com.example.sjcet.calculator_constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1,et2;
    int ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        et1 = (EditText)findViewById(R.id.ed1);
        et2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.txt1);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        ed1 = Integer.parseInt(s1);
        ed2 = Integer.parseInt(s2);
        int sum = ed1 + ed2;
        tv1.setText(Integer.toString(sum));
    }

    public void sub(View view) {
        et1 = (EditText)findViewById(R.id.ed1);
        et2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.txt1);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        ed1 = Integer.parseInt(s1);
        ed2 = Integer.parseInt(s2);
        int sum = ed1 - ed2;
        tv1.setText(Integer.toString(sum));
    }

    public void mul(View view) {
        et1 = (EditText)findViewById(R.id.ed1);
        et2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.txt1);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        ed1 = Integer.parseInt(s1);
        ed2 = Integer.parseInt(s2);
        int sum = ed1 * ed2;
        tv1.setText(Integer.toString(sum));
    }

    public void div(View view) {
        et1 = (EditText)findViewById(R.id.ed1);
        et2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.txt1);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        ed1 = Integer.parseInt(s1);
        ed2 = Integer.parseInt(s2);
        int sum = ed1 / ed2;
        tv1.setText(Integer.toString(sum));
    }
}

