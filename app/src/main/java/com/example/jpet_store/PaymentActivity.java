package com.example.jpet_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        continueBtn=findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(PaymentActivity.this,MainActivity.class);
                startActivity(goIntent);
            }
        });
    }
}