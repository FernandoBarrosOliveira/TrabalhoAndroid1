package com.example.fernandobarros.questao3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAnterior;
    private Button btnProximo;
    private int sequencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnAnterior = (Button) findViewById(R.id.btn_anterior);
        btnProximo = (Button) findViewById(R.id.btn_proximo);

        sequencia = 1;
        navegarFragments(sequencia);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sequencia <5){
                    sequencia++;
                }else{
                    sequencia = 1;
                }
                navegarFragments(sequencia);

            }
        });


        btnAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sequencia > 1 ){
                    sequencia--;
                }else{
                    sequencia = 5;
                }
                navegarFragments(sequencia);

            }
        });


    }

    private void navegarFragments(int seq) {

        Fragment fragment = null;

        switch (seq){
            case 1:
                fragment = new FirstFragment();
                break;
            case 2:
                fragment = new SecondFragment();
                break;
            case 3:
                fragment = new ThirdFragment();
                break;
            case 4:
                fragment = new FourthFragment();
                break;
            case 5:
                fragment = new FifthFragment();
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();


        if (fragmentManager.findFragmentById(R.id.main_frame_conteiner) !=null){
            fragmentManager.
                    beginTransaction().
                    remove(fragmentManager.findFragmentById(R.id.main_frame_conteiner)).
                    commit();
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame_conteiner, fragment);
        fragmentTransaction.commit();

    }
}
