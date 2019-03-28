package com.example.silpi.mysecondapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPreferenceActivity extends AppCompatActivity {
    private EditText usernameInput,passwordInput;
    private TextView textView;
    private Button btn_save,btn_display;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        usernameInput = findViewById(R.id.editText);
        passwordInput = findViewById(R.id.editText2);
        btn_save = findViewById(R.id.button);
        btn_display = findViewById(R.id.button1);
        textView = findViewById(R.id.tv);
        sharedPreferences = getSharedPreferences("userInfo",MODE_PRIVATE);
        //TODO:save the user login info
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("username",usernameInput.getText().toString());
                editor.putString("password",passwordInput.getText().toString());
                editor.apply();
                Toast.makeText(SharedPreferenceActivity.this,"Saved!",Toast.LENGTH_SHORT).show();
            }
        });
        //TODO:display the data which are saved
        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = sharedPreferences.getString("username","");
                String pw = sharedPreferences.getString("password","");
                textView.setText(name+ " " +pw);
            }
        });

    }
}
