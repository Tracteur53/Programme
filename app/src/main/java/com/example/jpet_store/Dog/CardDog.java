package com.example.jpet_store.Dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Login_Activity;
import com.example.jpet_store.MainActivity;
import com.example.jpet_store.R;

public class CardDog extends AppCompatActivity {

    TextView resetBtn2, checkoutBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_dog);

        resetBtn2=findViewById(R.id.resetBtn2);
        resetBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(CardDog.this, MainActivity.class);
                startActivity(goIntent);
            }
        });

        checkoutBtn2=findViewById(R.id.checkoutBtn2);
        checkoutBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(CardDog.this, Login_Activity.class);
                startActivity(goIntent);
            }
        });
    }
}