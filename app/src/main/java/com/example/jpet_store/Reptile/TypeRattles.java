package com.example.jpet_store.Reptile;

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

public class TypeRattles extends Fragment {

    TextView addcart2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_type_rattles, container, false);

        addcart2=root.findViewById(R.id.addcart2);
        addcart2.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer vers le panier
            public void onClick(View v) {
                Card card = new Card();
                Bundle bundle = new Bundle();
                bundle.putString("type","Rattles");
                bundle.putFloat("price", (float) 18.5);
                card.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,card).commit();
            }
        });
        return root;
    }
}