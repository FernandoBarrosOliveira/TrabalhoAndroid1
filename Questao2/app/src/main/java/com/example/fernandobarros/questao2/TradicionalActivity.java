package com.example.fernandobarros.questao2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TradicionalActivity extends AppCompatActivity {
    private Button btnSoma;
    private Button btnSub;
    private Button btnDiv;
    private Button btnMult;
    private Button btnResultado;
    private Button btnLimpar;

    private EditText edtDado;
    private double  resultado;
    private boolean iniciandoOperacao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradicional);

        btnSoma = (Button) findViewById(R.id.tradicional_btn_soma);
        btnSub = (Button) findViewById(R.id.tradicional_btn_sub);
        btnDiv = (Button) findViewById(R.id.tradicional_btn_div);
        btnMult = (Button) findViewById(R.id.tradicional_btn_mult);
        btnResultado = (Button) findViewById(R.id.tradicional_btn_resultado);
        btnLimpar = (Button) findViewById(R.id.tradicional_btn_limpar);
        edtDado = (EditText) findViewById(R.id.tradicional_edt_dado);

        resultado = 0;
        iniciandoOperacao = true;


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iniciandoOperacao){
                    iniciandoOperacao = false;
                    resultado =  Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText("");

                }else {
                    resultado = resultado + Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText(Double.toString(resultado));
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iniciandoOperacao){
                    resultado =  Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText("0");
                    iniciandoOperacao = false;
                }else {
                    resultado = resultado - Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText(Double.toString(resultado));
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iniciandoOperacao){
                    resultado =  Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText("0");
                    iniciandoOperacao = false;
                }else {
                    resultado = resultado / Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText(Double.toString(resultado));
                }

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iniciandoOperacao){
                    resultado =  Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText("0");
                    iniciandoOperacao = false;
                }else {
                    resultado = resultado * Double.parseDouble(edtDado.getText().toString());
                    edtDado.setText(Double.toString(resultado));
                }

            }
        });


        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDado.setText(Double.toString(resultado));
                resultado = 0;
                iniciandoOperacao = true;
            }
        });


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtDado.setText("0");
                resultado = 0;
                iniciandoOperacao = true;
            }
        });






    }
}
