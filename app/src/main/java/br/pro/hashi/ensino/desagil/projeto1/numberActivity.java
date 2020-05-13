package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.TextView;

public class numberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        TextView textMorse = findViewById(R.id.escrita_morse);
        TextView textTraducao = findViewById(R.id.traducao);
        Button buttonMorse = findViewById(R.id.botao_morse);
        Button buttonProximo = findViewById(R.id.botao_prox);
        Button buttonApagar = findViewById(R.id.botao_apagar);
        Button buttonSend = findViewById(R.id.botao_enviar);

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

        buttonApagar.setOnClickListener((view) -> {
            if (textMorse.getText().toString() !=""){
                textMorse.setText("");
            }
            else{
                textTraducao.setText("");
            }
        });

        buttonSend.setOnClickListener((view) -> {
            Intent intent = new Intent(this, EnviadoActivity.class);
            startActivity(intent);
        });

    }
}
