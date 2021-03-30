package com.example.jpet_store;
//
//import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.jpet_store.Bird.BirdActivity;
import com.example.jpet_store.Cat.CatActivity;
import com.example.jpet_store.Dog.Bulldog;
import com.example.jpet_store.Dog.DogActivity;
import com.example.jpet_store.Fish.AngelFish;
import com.example.jpet_store.Fish.Card;
import com.example.jpet_store.Reptile.ReptileActivity;
import com.example.jpet_store.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }




    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Acceuil:
                Toast.makeText(getApplicationContext(),"Acceuil",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new HomeFragment()).commit();
                return true;
            case R.id.Panier:
                Toast.makeText(getApplicationContext(),"Panier",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Card()).commit();
                return true;
            case R.id.Recherche:
                Toast.makeText(getApplicationContext(),"Recherche d'une bonne note",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Connexion:
                Toast.makeText(getApplicationContext(),"Connexion",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new SignIn_Activity()).commit();
                return true;
                //test
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.poisson:
                Toast.makeText(getApplicationContext(),"Poisson",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new AngelFish()).commit();
                break;
            case R.id.chien:
                Toast.makeText(getApplicationContext(),"Chien",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new DogActivity()).commit();
                break;
            case R.id.chat:
                Toast.makeText(getApplicationContext(),"Chat",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new CatActivity()).commit();
                break;
            case R.id.reptile:
                Toast.makeText(getApplicationContext(),"Reptile",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ReptileActivity()).commit();
                break;
            case R.id.oiseau:
                Toast.makeText(getApplicationContext(),"Oiseau",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new BirdActivity()).commit();
                break;
        }
        return true;
    }
}