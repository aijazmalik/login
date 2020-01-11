package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    EditText name,password;
    Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       name   =findViewById(R.id.et1);
        password=findViewById(R.id.et2);
        button=findViewById(R.id.btn);

   /*     button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name= et1.getText().toString();
                String pass = et2.getText().toString();

                if (name.equals("admin") && pass.equals("pass"))
                {
                    Intent in = new Intent(MainActivity.this,second.class);*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                     String  nam = name.getText().toString();
                     String pass=password.getText().toString();
               if (nam.equals("aijaz") && pass.equals("12345")) {
                   Intent in = new Intent(MainActivity.this,second.class);
                   in.putExtra("name",nam);
                   in.putExtra("pass",pass);
                   startActivity(in);
                   finish();


               }
               else
               {
                   Toast.makeText(MainActivity.this, "Check username and password", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}


