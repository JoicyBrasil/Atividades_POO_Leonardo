package com.atividade_4_13;

public class FibonacciTernario {
    
    public int calculcaFibonacci(int n) {
        return (n <= 1) ? n : calculcaFibonacci(n - 1) + calculcaFibonacci(n - 2);

    }
    
}
