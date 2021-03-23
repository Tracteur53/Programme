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

import com.example.jpet_store.Dog.TypeBulldog;
import com.example.jpet_store.Fish.Card;
import com.example.jpet_store.R;

public class TypeAmazon extends Fragment {

    TextView addcart2;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_type_amazon, container, false);

        addcart2=root.findViewById(R.id.addcart2);
        addcart2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Card()).commit();
            }
        });
        return root;
    }
}