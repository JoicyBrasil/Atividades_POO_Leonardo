package com.atividade_3_13;

public class Questao4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int fatorial = 1; // Usado para calcular o fatorial do número atual
            
            //A iteração ocorrerá até i ser menor ou igual a n
            for(int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
    }
    
}
