package com.example.jpet_store.Reptile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Dog.Bulldog;
import com.example.jpet_store.Dog.TypeBulldog;
import com.example.jpet_store.R;

public class Rattlesnake extends AppCompatActivity {

    TextView rattlesnake1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rattlesnake);

        rattlesnake1=findViewById(R.id.rattlesnake1);
        rattlesnake1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Rattlesnake.this, TypeRattles.class);
                startActivity(goIntent);
            }
        });
    }
}