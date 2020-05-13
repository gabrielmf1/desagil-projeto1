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
        Button buttonDict = findViewById(R.id.dic5_button);
        Button buttonSMS = findViewById(R.id.sms);

        buttonTranslator.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Hist2Activity.class);
            startActivity(intent);
        });

        buttonLista.setOnClickListener((view) -> {
            Intent intent = new Intent(this, PredefinedTexts.class);
            startActivity(intent);
        });

        buttonDict.setOnClickListener((view) -> {
            Intent intent = new Intent(this, dic5Activity.class);
            startActivity(intent);
        });

        buttonSMS.setOnClickListener((view) -> {
            Intent intent = new Intent(this, SMS.class);
            startActivity(intent);
        });
    }
}
