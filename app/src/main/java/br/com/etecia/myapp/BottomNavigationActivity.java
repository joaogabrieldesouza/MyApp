package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView idBottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_layout);

        idBottomNavView = findViewById(R.id.BottomNavView);

        idBottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mNavFav:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Favorito",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.mNavMusic:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Musica",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.mNavPlaces:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Lugares",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.mNavNews:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei nas Noticias",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}




