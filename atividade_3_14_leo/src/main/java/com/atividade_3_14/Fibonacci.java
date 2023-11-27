package com.atividade_3_14;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
   
        while(b <= 100) {
            // Imprime os valores de a e b na mesma linha
            System.out.println(a + " " + b + " ");
            // Atualiza o valor de a para o próximo termo da série de Fibonacci
            a += b;
            // Atualiza o valor de b para o termo seguinte na série de Fibonacci
            b += a;
        }
        
    }
   
}

    

