package com.example.jpet_store.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jpet_store.AngelFish;
import com.example.jpet_store.PageType;
import com.example.jpet_store.R;

public class SlideshowFragment extends AppCompatActivity {

    private SlideshowViewModel slideshowViewModel;
    //text
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
                Intent goIntent=new Intent(SlideshowFragment.this, AngelFish.class);
                startActivity(goIntent);
            }
        });
    }



}