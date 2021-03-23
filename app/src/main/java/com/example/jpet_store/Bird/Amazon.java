package com.example.jpet_store.Bird;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpet_store.Fish.PageType;
import com.example.jpet_store.R;
import com.example.jpet_store.Reptile.Rattlesnake;
import com.example.jpet_store.Reptile.TypeRattles;

public class Amazon extends Fragment {

    TextView amazon1;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_amazon, container, false);

        amazon1=root.findViewById(R.id.amazon1);
        amazon1.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new TypeAmazon()).commit();
            }
        });
        return root;
    }
}