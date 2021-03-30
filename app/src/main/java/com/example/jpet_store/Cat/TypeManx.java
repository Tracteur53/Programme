package com.example.jpet_store.Cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpet_store.Fish.Card;
import com.example.jpet_store.R;

public class TypeManx extends Fragment {

    TextView addcart3;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_type_manx, container, false);

        addcart3=root.findViewById(R.id.addcart3);
        addcart3.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                Card card = new Card();
                Bundle bundle = new Bundle();
                bundle.putString("type","Manx");
                bundle.putFloat("price", (float) 58.5);
                card.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Card()).commit();
            }
        });
        return root;
    }
}