package com.atividade_complementar;

public class Profissional extends Pessoa{
    private String profissao;

    public Profissional(String profissao) {
        this.profissao = profissao;

    }

    public String getProfissao(){
        return profissao;
    }
    
}
