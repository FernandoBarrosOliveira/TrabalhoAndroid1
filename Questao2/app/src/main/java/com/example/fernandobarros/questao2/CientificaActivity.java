package com.example.fernandobarros.questao2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CientificaActivity extends AppCompatActivity {
    private Button btnLog;
    private Button btnExp;
    private Button btnRaiz;
    private Button btnSen;
    private Button btnCos;
    private Button btnTan;
    private EditText edtDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cientifica);

        btnLog = (Button) findViewById(R.id.cientifica_btn_log);
        btnExp = (Button) findViewById(R.id.cientifica_btn_exp);
        btnRaiz = (Button) findViewById(R.id.cientifica_btn_raiz);
        btnSen = (Button) findViewById(R.id.cientifica_btn_sen);
        btnCos = (Button) findViewById(R.id.cientifica_btn_cos);
        btnTan = (Button) findViewById(R.id.cientifica_btn_tan);
        edtDado = (EditText) findViewById(R.id.cientifica_edt_dado);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.log(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.exp(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));
            }
        });


        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.sqrt(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));
            }
        });


        btnSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.sin(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));

            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.cos(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));

            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Math.tan(Double.parseDouble(edtDado.getText().toString()));
                edtDado.setText(Double.toString(resultado));
            }
        });


    }
}
