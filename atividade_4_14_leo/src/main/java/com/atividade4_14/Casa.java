package com.atividade4_14;

public class Casa {
    public String cor;
    public boolean porta1;
    public boolean porta2;
    public boolean porta3;

    public Casa() {
        this.cor = "Lilás";
        this.porta1 = false;
        this.porta2 = false;
        this.porta3 = false;
    }

    public void pinta(String s) {
        this.cor = s;
        System.out.println("A casa está pintade de " + cor);
    }

    public int quantasPortasEstaoAbertas() {
        int aux = 0;

        if(porta1) aux++;
        if(porta2) aux++;
        if(porta3) aux++;
        return aux;
    }
    
}
