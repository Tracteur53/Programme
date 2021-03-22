package com.example.jpet_store.Bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.R;
import com.example.jpet_store.Reptile.Rattlesnake;
import com.example.jpet_store.Reptile.TypeRattles;

public class Amazon extends AppCompatActivity {

    TextView amazon1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

        amazon1=findViewById(R.id.amazon1);
        amazon1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(Amazon.this, TypeAmazon.class);
                startActivity(goIntent);
            }
        });
    }
}