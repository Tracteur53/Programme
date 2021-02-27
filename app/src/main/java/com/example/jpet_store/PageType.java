package com.example.jpet_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//C'est la page ou on trouve le taleau des types des poissons
public class PageType extends AppCompatActivity {
    TextView type1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_type);
        type1=findViewById(R.id.type1);
        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Intent goIntent=new Intent(PageType.this,AngelFish.class);
                startActivity(goIntent);
            }
        });
    }


}