package com.example.fernandobarros.questao2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerfilActivity extends AppCompatActivity {
    private Button btTradicional;
    private Button btCientifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        btTradicional = (Button) findViewById(R.id.perfil_btn_tradicional);
        btCientifica = (Button) findViewById(R.id.perfil_btn_cientifica);

        btTradicional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfilActivity.this, TradicionalActivity.class);
                startActivity(intent);
            }
        });

        btCientifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerfilActivity.this, CientificaActivity.class);
                startActivity(intent);
            }
        });
    }
}
