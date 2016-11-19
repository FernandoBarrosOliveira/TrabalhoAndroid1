package com.example.fernandobarros.questao1.modelo;

/**
 * Created by Fernando on 18/11/2016.
 */

public class Resposta {
    private String resposta;
    private boolean valorResposta;

    Resposta(String resposta, boolean valorResposta){
        this.resposta = resposta;
        this.valorResposta = valorResposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public boolean isValorResposta() {
        return valorResposta;
    }

    public void setValorResposta(boolean valorResposta) {
        this.valorResposta = valorResposta;
    }

    @Override
    public String toString() {
        return this.getResposta();
    }
}
