package com.example.jpet_store.Fish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jpet_store.Login_Activity;
import com.example.jpet_store.R;

//C'est la page ou on trouve le taleau des types des poissons
public class PageType extends Fragment {
    TextView addcart;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_page_type, container, false);
        //si on clique sur add card on passe à la page Card
        addcart=root.findViewById(R.id.addcart);
        addcart.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de ce deplacer du tableau des poissons au tableau de Angelfish
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Card()).commit();
            }
        });
        return root;
    }


}