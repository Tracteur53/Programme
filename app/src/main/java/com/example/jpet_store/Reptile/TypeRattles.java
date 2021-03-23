package com.example.jpet_store.Reptile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Dog.TypeBulldog;
import com.example.jpet_store.Fish.Card;
import com.example.jpet_store.R;

public class TypeRattles extends AppCompatActivity {

    TextView addcart2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_rattles);

        addcart2=findViewById(R.id.addcart2);
        addcart2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(TypeRattles.this, Card.class);
                startActivity(goIntent);
            }
        });
    }
}