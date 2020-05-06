package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Hist2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist2);

        TextView textMorse = findViewById(R.id.escrita_morse);
        TextView textTraducao = findViewById(R.id.traducao);
        Button buttonMorse = findViewById(R.id.botao_morse);
        Button buttonProximo = findViewById(R.id.botao_prox);
        Button buttonEspaco = findViewById(R.id.botao_espaço);
        Button buttonApagar = findViewById(R.id.botao_apagar);
        Button buttonDicionario = findViewById(R.id.botao_dicionario);

        Translator translator = new Translator();

        String morse_escrito = textMorse.getText().toString();

        buttonMorse.setOnClickListener((view) -> {
            String ponto = ".";
            if (textMorse.getText() != morse_escrito){
                textMorse.setText( textMorse.getText() + ponto);
            }
            else{
                textMorse.setText(ponto);
            }
        });

        buttonMorse.setOnLongClickListener((view) -> {
            String traco = "-";
            if (textMorse.getText() != morse_escrito){
                textMorse.setText( textMorse.getText() + traco);
            }
            else{
                textMorse.setText(traco);
            }
            return true;
        });

        String frase_traduzida = textTraducao.getText().toString();

        buttonProximo.setOnClickListener((view) -> {
            char letra = translator.morseToChar(textMorse.getText().toString());
            if (textTraducao.getText() != frase_traduzida){
                textTraducao.setText(textTraducao.getText().toString() + letra);
            }
            else{
                textTraducao.setText(letra+"");
            }
            textMorse.setText("");
        });

        buttonEspaco.setOnClickListener((view) ->{
            textTraducao.setText(textTraducao.getText().toString() + " ");
        });

        buttonApagar.setOnClickListener((view) -> {
            if (textMorse.getText().toString() !=""){
                textMorse.setText("");
            }
            else{
                textTraducao.setText("");
            }
        });

        buttonDicionario.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Dicionario.class);
            startActivity(intent);
        });

    }
}
