package com.example.jpet_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jpet_store.ui.slideshow.SlideshowFragment;

public class AngelFish extends AppCompatActivity{
    //liaison entre page angelfish et card
    TextView angelfish1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_type);
        angelfish1=findViewById(R.id.angelfish1);
        angelfish1.setOnClickListener(new View.OnClickListener() {
            @Override
            //on cliquant sur EST_1 on se deplace vers la page card
            public void onClick(View v) {
                Intent goIntent=new Intent(AngelFish.this, Card.class);
                startActivity(goIntent);
            }
        });
    }

}
