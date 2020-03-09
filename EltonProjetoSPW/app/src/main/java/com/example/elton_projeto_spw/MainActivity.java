package com.example.elton_projeto_spw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button afogados;
    Button central;
    Button decisao;
    Button nautico;
    Button petrolina;
    Button retro;
    Button salgueiro;
    Button santa_cruz;
    Button sport;
    Button vitoria_das_tabocas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        afogados = (Button)findViewById(R.id.afogados);
        central = (Button)findViewById(R.id.central);
        decisao = (Button)findViewById(R.id.decisao);
        nautico = (Button)findViewById(R.id.nautico);
        petrolina = (Button)findViewById(R.id.petrolina);
        retro = (Button)findViewById(R.id.retro);
        salgueiro = (Button)findViewById(R.id.salgueiro);
        santa_cruz = (Button)findViewById(R.id.santacruz);
        sport = (Button)findViewById(R.id.sport);
        vitoria_das_tabocas = (Button)findViewById(R.id.vitoriadastabocas);

        afogados.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Afogados.class);
            startActivity(it);
        });

        central.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Central.class);
            startActivity(it);
        });

        decisao.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Decisao.class);
            startActivity(it);
        });

        nautico.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Nautico.class);
            startActivity(it);
        });

        petrolina.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Petrolina.class);
            startActivity(it);
        });

        retro.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Retro.class);
            startActivity(it);
        });

        salgueiro.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Salgueiro.class);
            startActivity(it);
        });

        santa_cruz.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, SantaCruz.class);
            startActivity(it);
        });

        sport.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, Sport.class);
            startActivity(it);
        });

        vitoria_das_tabocas.setOnClickListener((view) -> {
            Intent it = new Intent(MainActivity.this, VitoriaDasTabocas.class);
            startActivity(it);
        });
    }
}
