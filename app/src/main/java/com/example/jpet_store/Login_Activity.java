package com.example.jpet_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {

    Button loginBtn,registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        loginBtn=findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Login_Activity.this,PaymentActivity.class);
                startActivity(goIntent);
            }
        });

        registerBtn=findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Login_Activity.this,SignIn_Activity.class);
                startActivity(goIntent);
            }
        });
    }
}