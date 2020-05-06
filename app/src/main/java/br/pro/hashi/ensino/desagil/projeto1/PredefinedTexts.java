package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PredefinedTexts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predefined_texts);

        Button buttonRefeicao = findViewById(R.id.refeicao);
        Button buttonBanheiro = findViewById(R.id.banheiro);
        Button buttonPosicao = findViewById(R.id.posicao);

        buttonRefeicao.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Refeicao.class);
            startActivity(intent);
        });

        buttonBanheiro.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Banheiro.class);
            startActivity(intent);
        });

        buttonPosicao.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Posicao.class);
            startActivity(intent);
        });

    }
}

