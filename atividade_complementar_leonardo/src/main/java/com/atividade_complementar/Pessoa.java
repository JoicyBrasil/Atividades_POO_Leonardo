package com.atividade_complementar;

public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;

    public Pessoa(String nome, int idade, String telefone) {
        try {
            if (nome != null) {
                this.nome = nome;
            } else {
                throw new NullPointerException("Nome não pode ser nulo.");
            }
            
            this.idade = idade;
            this.telefone = telefone;
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa() {

    }
}
