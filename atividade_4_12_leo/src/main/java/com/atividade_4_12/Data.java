package com.atividade_4_12;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String dataFormatada() {
        return dia + "/" + mes + "/" + ano;
    }
    
}