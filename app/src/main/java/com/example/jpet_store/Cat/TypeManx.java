package com.example.jpet_store.Cat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jpet_store.Dog.CardDog;
import com.example.jpet_store.Dog.TypeBulldog;
import com.example.jpet_store.R;

public class TypeManx extends AppCompatActivity {

    TextView addcart3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_manx);

        addcart3=findViewById(R.id.addcart3);
        addcart3.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(TypeManx.this, CardCat.class);
                startActivity(goIntent);
            }
        });
    }
}