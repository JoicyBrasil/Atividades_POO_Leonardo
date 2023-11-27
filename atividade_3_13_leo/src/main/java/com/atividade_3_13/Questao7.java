package com.atividade_3_13;

public class Questao7 {
    public static void main(String[] args) {
        int x = 15;

        while(x != 1) {
            System.out.println( x + " - ");

            if (x % 2 == 0) {
                x = x /2;
            }
            else {
                x = 3 * x + 1;
            }
        }
        System.out.println(x);
    }
    
}
