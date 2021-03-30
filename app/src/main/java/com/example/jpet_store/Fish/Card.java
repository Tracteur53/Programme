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
import com.example.jpet_store.MainActivity;
import com.example.jpet_store.R;
import com.example.jpet_store.ui.home.HomeFragment;

public class Card extends Fragment {

    TextView resetBtn, checkoutBtn, description, quantity, total, subTotal;
    float totalN, subTotalN;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_card, container, false);
        resetBtn= root.findViewById(R.id.resetBtn);
        description = root.findViewById(R.id.description);
        quantity = root.findViewById(R.id.quantity);
        total = root.findViewById(R.id.total);
        subTotal = root.findViewById(R.id.subTotal);

        if(getArguments() != null) {
            description.setText(getArguments().getString("type"));
            totalN = getArguments().getFloat("price");
            subTotalN = totalN;
            total.setText(Float.toString(totalN)+"$");
            String text = Float.toString(subTotalN);
            subTotal.setText("Sub Total : " + text + "$");
            quantity.setText("1");
        }
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de se deplacer à la page d'acceuil
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();
            }
        });

        checkoutBtn=root.findViewById(R.id.checkoutBtn);
        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de se déplacer sur la page de connexion
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Login_Activity()).commit();
            }
        });

        quantity.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet d'incrémenter la quantité
            public void onClick(View v) {
                int nb = Integer.parseInt(quantity.getText().toString());
                nb++;
                quantity.setText(Integer.toString(nb));
               subTotalN = subTotalN + totalN;
                String text = Float.toString(subTotalN);
                subTotal.setText("Sub Total : "+text+"$");
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Cette fonction permet de se déplacer sur la page de connexion
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Card()).commit();
            }
        });
        return root;
    }
}