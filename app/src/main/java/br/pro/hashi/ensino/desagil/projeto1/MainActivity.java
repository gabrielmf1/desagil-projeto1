package br.pro.hashi.ensino.desagil.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textExample = findViewById(R.id.text_example);
        EditText editExample = findViewById(R.id.edit_example);
        Button buttonExample = findViewById(R.id.button_example);

        buttonExample.setOnClickListener((view) -> {
            String content = editExample.getText().toString();
            textExample.setText(content);
        });
    }
}
