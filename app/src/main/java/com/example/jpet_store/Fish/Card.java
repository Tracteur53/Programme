package com.example.jpet_store.Fish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Login_Activity;
import com.example.jpet_store.MainActivity;
import com.example.jpet_store.R;

public class Card extends AppCompatActivity {

    TextView resetBtn, checkoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        resetBtn=findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Card.this, MainActivity.class);
                startActivity(goIntent);
            }
        });

        checkoutBtn=findViewById(R.id.checkoutBtn);
        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Card.this, Login_Activity.class);
                startActivity(goIntent);
            }
        });
    }
}