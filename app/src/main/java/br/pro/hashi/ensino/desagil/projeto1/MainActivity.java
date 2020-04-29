package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTranslator = findViewById(R.id.tradutor_button);
        Button buttonLista = findViewById(R.id.texts_button);

        buttonTranslator.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Hist2Activity.class);
            startActivity(intent);
        });

       // buttonLista.setOnClickListener((view) -> {
       //     Intent intent = new Intent(this, PredefinedTexts.class);
       //     startActivity(intent);
        //});
    }
}
