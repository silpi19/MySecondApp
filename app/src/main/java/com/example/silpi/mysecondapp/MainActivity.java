package com.example.silpi.mysecondapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button,btn_save;
    private EditText mytext;
    private String message;
    private TextView textappcontext;
    private TextView textactivitycontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = findViewById(R.id.layout);
        button= findViewById(R.id.myButton);
        mytext=findViewById(R.id.myText);
        btn_save = findViewById(R.id.btn_sharedpreference);

        textappcontext = findViewById(R.id.text);
        textappcontext = new TextView(getApplicationContext());
        textappcontext.setText("Application Context");
        textappcontext.setTextSize(30);
        layout.addView(textappcontext);

        textactivitycontext = new TextView(this);
        textactivitycontext.setText("Activity Context");
        textactivitycontext.setTextSize(40);
        layout.addView(textactivitycontext);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(MainActivity.this,startactivity.class);
                message=mytext.getText().toString();
                intent.putExtra("EXTRA_MESSAGE", message);
               startActivity(intent);
            }
        });
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shared_preference_intent = new Intent(MainActivity.this,SharedPreferenceActivity.class);
                startActivity(shared_preference_intent );
            }
        });

            }

}


