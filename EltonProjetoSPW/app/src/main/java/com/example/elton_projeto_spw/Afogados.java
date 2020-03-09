package com.example.elton_projeto_spw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Afogados extends AppCompatActivity {

    Button pagina_inicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afogados);

        pagina_inicial = (Button) findViewById(R.id.pagina_inicial);

        pagina_inicial.setOnClickListener((view) -> {
            Intent it = new Intent(Afogados.this, MainActivity.class);
            startActivity(it);
        });
    }
}
