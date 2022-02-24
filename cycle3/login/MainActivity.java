package com.example.sjcet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    EditText usr,pwd;
    String username="admin";
    String password="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.bt2);
        button2=findViewById(R.id.bt1);
        usr=findViewById(R.id.ed2);
        pwd=findViewById(R.id.ed1);
    }

    public void click(View view) {
        Openregactivity();
    }
    public void Openregactivity()
    {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void click1(View view) {
        String u=usr.getText().toString();
        String p=pwd.getText().toString();
        if (u.equals(username) && p.equals(password)) {
            Openloginactivity();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
        }
    }

    public void Openloginactivity()
    {
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
