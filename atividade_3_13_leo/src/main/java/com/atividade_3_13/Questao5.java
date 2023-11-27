package com.atividade_3_13;

public class Questao5 {
    public static void main(String[] args) {
        int [] numeros = {20, 30, 40};

        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i]; //Pega o número atual que está na array
            long fatorial = 1;

            for (long j = 1; j <= n; j++) {
                fatorial *= j; // Multiplica o fatorial pelo contador j
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
    }
    // O erro ocorre porque o valor do fatorial excede o valor suportado por um tipo de dado int, dessa forma, acontece o estouro de int.
    // Troquei o tipo da variável para long, só o fatorial de 20! = 2432902008176640000 que está correto, para 30 e 40 ocorreu o estouro de long.

    
}
