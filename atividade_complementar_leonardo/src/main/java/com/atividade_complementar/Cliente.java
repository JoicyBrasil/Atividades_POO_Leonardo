package com.atividade_complementar;

public class Cliente extends Pessoa{
    private String rua;
    private int numero;
    private String bairro;

    public Cliente(String nome, int idade, String telefone, String rua, int numero, String bairro) {
        super(nome, idade, telefone);
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   public String getEnderecoCompleto() {
    return getRua() + ", " + getNumero() + ", " + getBairro();
}   

}
