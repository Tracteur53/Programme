package com.example.jpet_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//C'est la page ou on trouve le taleau des types des poissons
public class PageType extends AppCompatActivity {
    TextView addcart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_type);
        //si on clique sur add card on passe à la page Card
        addcart=findViewById(R.id.addcart);
        addcart.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(PageType.this,Card.class);
                startActivity(goIntent);
            }
        });
    }


}