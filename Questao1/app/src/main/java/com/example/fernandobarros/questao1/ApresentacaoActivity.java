package com.example.fernandobarros.questao1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ApresentacaoActivity extends AppCompatActivity {
    private Button btnInicar;
    private EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

        btnInicar = (Button) findViewById(R.id.apresentacao_btn_iniciar);
        edtNome = (EditText) findViewById(R.id.apresentacao_edt_nome);


        btnInicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApresentacaoActivity.this, QuizActivity.class);
                intent.putExtra("NOME_USUARIO", edtNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
