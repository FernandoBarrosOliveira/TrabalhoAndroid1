package com.example.fernandobarros.questao1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fernandobarros.questao1.modelo.Questao;
import com.example.fernandobarros.questao1.modelo.Resposta;

import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private ImageView imgQuestao;
    private TextView txtQuestao;
    private ListView lvRespotas;
    private int numeroQuestao;
    private int numeroAcertos;
    private String nomeUsuario;

    @Override
    protected void onResume() {
        super.onResume();
        numeroQuestao = 1;
        numeroAcertos = 0;
        montarEstrutura(gerarQuestao(numeroQuestao));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        imgQuestao = (ImageView) findViewById(R.id.quiz_img_questao);
        txtQuestao = (TextView) findViewById(R.id.quiz_txt_questao);
        lvRespotas = (ListView) findViewById(R.id.quiz_listview_resposta);
        Intent intent = getIntent();
        nomeUsuario = intent.getStringExtra("NOME_USUARIO");

        lvRespotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Resposta resposta = (Resposta) lvRespotas.getItemAtPosition(position);
                String msg;

                if (resposta.isValorResposta()){
                    msg = "Correto";
                    numeroAcertos++;
                }else{
                    msg = "Errado";
                }

                if (numeroQuestao <5){
                    numeroQuestao++;
                    Toast.makeText(QuizActivity.this, msg, Toast.LENGTH_SHORT).show();
                    montarEstrutura(gerarQuestao(numeroQuestao));
                }else{
                    Intent intent = new Intent(QuizActivity.this, ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    intent.putExtra("NOME_USUARIO", nomeUsuario);
                    intent.putExtra("QTD_ACERTO", numeroAcertos);
                    intent.putExtra("QTD_QUESTAO", numeroQuestao);
                    startActivity(intent);
                }

            }
        });

    }

    private Questao gerarQuestao(int numeroPergunta){

        switch (numeroPergunta){
            case 1:
                Questao q1 = new Questao();
                q1.setEnderecoImagem(R.drawable.questao1);
                q1.setPergunta("Quem Descobriu o brasil?");
                q1.adicionarResposta("Pedro Alvares", true);
                q1.adicionarResposta("Joao Alvares", false);
                q1.adicionarResposta("Jose Alvares", false);
                q1.adicionarResposta("Carlos Alvares", false);
                return q1;
            case 2:
                Questao q2 = new Questao();
                q2.setEnderecoImagem(R.drawable.questao2);
                q2.setPergunta("Quem Descobriu o America?");
                q2.adicionarResposta("Islamico Colombo", false);
                q2.adicionarResposta("Judeu Colombo", false);
                q2.adicionarResposta("Cristovao Colombo", true);
                q2.adicionarResposta("Hindu Colombo", false);
                return q2;

            case 3:
                Questao q3 = new Questao();
                q3.setEnderecoImagem(R.drawable.questao3);
                q3.setPergunta("Quem é o presidente do brasil o America?");
                q3.adicionarResposta("Fora Temer", false);
                q3.adicionarResposta("Dilma", false);
                q3.adicionarResposta("Lula", false);
                q3.adicionarResposta("Michel Temer", true);
                return q3;

            case 4:
                Questao q4 = new Questao();
                q4.setEnderecoImagem(R.drawable.questao4);
                q4.setPergunta("Quanto é 1+1?");
                q4.adicionarResposta("1", false);
                q4.adicionarResposta("2", true);
                q4.adicionarResposta("3", false);
                q4.adicionarResposta("4", false);
                return q4;

            case 5:
                Questao q5 = new Questao();
                q5.setEnderecoImagem(R.drawable.questao5);
                q5.setPergunta("Quanto é a raiz quadrada de 4");
                q5.adicionarResposta("64", false);
                q5.adicionarResposta("32", false);
                q5.adicionarResposta("16", false);
                q5.adicionarResposta("4", true);
                return q5;
        }

        return null;

    }

    private void  montarEstrutura(Questao questao){
        imgQuestao.setImageResource(questao.getEnderecoImagem());
        txtQuestao.setText(questao.getPergunta());
        List<Resposta>  respostas = questao.getRespostas();
        ArrayAdapter<Resposta> adapter = new ArrayAdapter<Resposta>(this, android.R.layout.simple_list_item_1, respostas);
        lvRespotas.setAdapter(adapter);
    }


}
