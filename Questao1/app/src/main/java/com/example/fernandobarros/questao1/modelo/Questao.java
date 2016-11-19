package com.example.fernandobarros.questao1.modelo;

import java.util.ArrayList;

/**
 * Created by Fernando on 17/11/2016.
 */

public class Questao {
    private int enderecoImagem;
    private String pergunta;
    private ArrayList<Resposta> respostas = new ArrayList<Resposta>();

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getEnderecoImagem() {
        return enderecoImagem;
    }

    public void setEnderecoImagem(int enderecoImagem) {
        this.enderecoImagem = enderecoImagem;
    }

    public ArrayList<Resposta> getRespostas() {
        return respostas;
    }

    public void adicionarResposta(String resposta, boolean valorResposta){
        Resposta resp = new Resposta(resposta, valorResposta);
        this.respostas.add(resp);

    }
}
