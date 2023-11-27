package com.atividade_4_13;

public class FibonacciRecursivo {
    
    public int calculcaFibonacci(int n) {
        if(n <= 1) {
            return n;
        } else {
            return calculcaFibonacci(n - 1) + calculcaFibonacci(n - 2);
        }
    }

    /*Questão 2 da atividade 4.13
    A recursiva é mais lenta devido à quantidade de chamadas de função e a repetição de cálculos. No modo iterativo, o calculo é
    feito de maneira direta e eficiente. */
   
        
}

    
    

    
    

