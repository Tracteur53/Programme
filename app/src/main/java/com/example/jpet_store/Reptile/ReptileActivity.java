package com.example.jpet_store.Reptile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Dog.Bulldog;
import com.example.jpet_store.Dog.DogActivity;
import com.example.jpet_store.R;

public class ReptileActivity extends AppCompatActivity {

    TextView reptile1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptile);

        reptile1=findViewById(R.id.reptile1);
        reptile1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(ReptileActivity.this, Rattlesnake.class);
                startActivity(goIntent);
            }
        });
    }
}