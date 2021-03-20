package com.example.jpet_store.Cat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Dog.Bulldog;
import com.example.jpet_store.Dog.DogActivity;
import com.example.jpet_store.R;

public class CatActivity extends AppCompatActivity {

    TextView cat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        cat1=findViewById(R.id.cat1);
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(CatActivity.this, Manx.class);
                startActivity(goIntent);
            }
        });
    }
}