package com.example.fernandobarros.questao1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtNome = (TextView) findViewById(R.id.resultado_txt_nome);
        txtResultado = (TextView) findViewById(R.id.resultado_txt_resultado);
        Intent intent = getIntent();
        String msgNome = "Resultado de " + intent.getStringExtra("NOME_USUARIO");
        String msgAcertp = "Acertou " + intent.getIntExtra("QTD_ACERTO",0)+
                " perguntas de um total de " + intent.getIntExtra("QTD_QUESTAO",0);


        txtNome.setText(msgNome);
        txtResultado.setText(msgAcertp);

    }
}
