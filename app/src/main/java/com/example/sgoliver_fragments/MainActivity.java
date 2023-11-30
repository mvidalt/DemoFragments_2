package com.example.sgoliver_fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciar el Fragment y añadirlo dinámicamente a la actividad
        SimpleFragment simpleFragment = new SimpleFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, simpleFragment) // R.id.fragment_container es el contenedor definido en el layout de la actividad
                .commit();
    }
}
