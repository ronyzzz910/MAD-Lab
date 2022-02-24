package com.example.sjcet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;

public class Main2Activity extends AppCompatActivity {
    Button cancel,submit;
    EditText ed2,ed3,ed6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cancel=findViewById(R.id.cancel);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        ed6=findViewById(R.id.ed6);
        submit=findViewById(R.id.button);
    }


    public void back(View view) {
        Opencancelactivity();

    }
    public void Opencancelactivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void valid(View view) {

        Opensubmitactivity();
        check();
    }
    public void Opensubmitactivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    ////    boolean isEmpty(EditText text) {
////        CharSequence str = text.getText().toString();
////        return TextUtils.isEmpty(str);
//
//    }
    public void check()
    {
        //String val = ed2.getText().toString();

        if(ed2.length()==0)
        {
            ed2.setError("Name Field Cannot be Empty");
        }
        if (ed3.length()==0)
        {
            ed3.setError("Email Field Cannot be Empty ");
        }
        if (ed6.length()==0)
        {
            ed6.setError("DOB Field Cannot be Empty ");
        }

    }
}
