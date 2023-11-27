package com.atividade4_14;

////Programa 2 - Atividade 4.14 (Fixando o Conhecimento)
public class Porta {
    public boolean aberta;
    public String cor;
    public double dimensaoX;
    public double dimensaoY;
    public double dimensaoZ;

    public Porta() {
        this.aberta = false;
        this.cor = "azul";
        this.dimensaoX = 1.5;
        this.dimensaoY = 2.5;
        this.dimensaoZ = 0.5;
    }

    public void abre() {
        aberta = true;

    }

    public void fecha() {
        aberta = false;

    }

    public void pinta( String s) {
        cor = s;

    }

    public boolean estaAberta() {
        return aberta;

    }
    
}
