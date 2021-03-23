package com.example.jpet_store.Bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.R;
import com.example.jpet_store.Reptile.Rattlesnake;
import com.example.jpet_store.Reptile.ReptileActivity;

public class BirdActivity extends AppCompatActivity {

    TextView bird1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        bird1=findViewById(R.id.bird1);
        bird1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(BirdActivity.this, Amazon.class);
                startActivity(goIntent);
            }
        });
    }
}