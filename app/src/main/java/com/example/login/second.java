package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView textView1,textView2;
    Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.t1);
        textView2 = findViewById(R.id.t1);
        button = findViewById(R.id.btn2);

        Bundle bl = getIntent().getExtras();
        String name = bl.getString("nam");
        String pass = bl.getString("pass");

        textView1.setText(name);
        textView2.setText(pass);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {

                Intent in = new Intent(second.this, MainActivity.class);
                startActivity(in);
                finish();
            }
        });

    }
}