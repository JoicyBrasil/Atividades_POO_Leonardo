package com.atividade_3_13;

public class Questao6 {
      public static void main(String[] args) {
    int maximo = 100;
    int a = 0;
    int b = 1;
    
    //Número de elementos da série de Fibonacci
    int numeros = 6;

    System.out.println("Os primeiros " + numeros +  "números da série de Fibonacci são: ");

    int cont = 0;
    while (cont < numeros) {
        if (a < maximo) {
            System.out.println(a + "");
            cont++;
        }
        int c = a + b;
        a = b;
        b = c;
    }

    
   } 
    
}
