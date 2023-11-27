package com.atividade_4_13;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FibonacciRecursivo fibonacci = new FibonacciRecursivo();

        for(int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculcaFibonacci(i);
            System.out.println(resultado);
        }

        FibonacciTernario fibonacciTernario = new FibonacciTernario();

        for(int i = 1; i <= 6; i++) {
            System.out.println(fibonacciTernario.calculcaFibonacci(i));
        }
    }
}
