
package com.example.elton_projeto_spw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class VitoriaDasTabocas extends AppCompatActivity {

    Button pagina_inicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitoria_das_tabocas);

        pagina_inicial = (Button) findViewById(R.id.pagina_inicial);

        pagina_inicial.setOnClickListener((view) -> {
            Intent it = new Intent(VitoriaDasTabocas.this, MainActivity.class);
            startActivity(it);
        });
    }
}
