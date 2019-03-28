package com.example.silpi.mysecondapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
public class startactivity extends AppCompatActivity {
   private String msg;
   private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);


        msg= getIntent().getStringExtra("EXTRA_MESSAGE");
        text=findViewById(R.id.mytxt);
        text.setText("Welcome "+msg);
        Toast.makeText(this,"Welcome USER",Toast.LENGTH_SHORT).show();
    }


}