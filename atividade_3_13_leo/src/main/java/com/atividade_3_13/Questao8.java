package com.atividade_3_13;

public class Questao8 {
     public static void main(String[] args) {
        int numero = 8; //Define o número de linhas da tabela

        for (int i = 1; i <= numero; i++) {
            for(int j = 1; j <= numero; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    
    
}
