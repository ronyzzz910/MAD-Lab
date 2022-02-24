package com.example.sjcet.intentmsgtransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button) findViewById(R.id.btn);
        send_text = (EditText) findViewById(R.id.ed1);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = send_text.getText().toString();


                Intent intent = new Intent(getApplicationContext(),
                        Main2Activity.class);

                intent.putExtra("message_key", str);
// start the Intent
                startActivity(intent);
            }

        });
    }
}
