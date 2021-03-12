package com.example.jpet_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn_Activity extends AppCompatActivity {

    Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        nextBtn=findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(SignIn_Activity.this,SignIn2_Activity.class);
                startActivity(goIntent);
            }
        });
    }
}