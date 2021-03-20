package com.example.jpet_store.Dog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.R;

public class TypeBulldog extends AppCompatActivity {

    TextView addcart2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_bulldog);

        addcart2=findViewById(R.id.addcart2);
        addcart2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(TypeBulldog.this, CardDog.class);
                startActivity(goIntent);
            }
        });
    }
}