package com.example.jpet_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jpet_store.ui.slideshow.SlideshowFragment;

public class AngelFish extends Fragment{
    //liaison entre page angelfish et card
    TextView angelfish1;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.angel_fish, container, false);
        angelfish1=root.findViewById(R.id.angelfish1);
        angelfish1.setOnClickListener(new View.OnClickListener() {
            @Override
            //on cliquant sur EST_1 on se deplace vers la page card
            public void onClick(View v) {

            }
        });
        return root;
    }

}
