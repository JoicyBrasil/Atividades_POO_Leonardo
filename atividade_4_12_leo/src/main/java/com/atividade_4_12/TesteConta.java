package com.atividade_4_12;

public class TesteConta {
    public static void main(String[] args) {
        
        Data dataAbertura = new Data(23, 11, 2023);
        Conta minhaConta = new Conta("Maria", "0101", 1020, dataAbertura, 2000.0);
        
        //Conta.saldo = 1234;
        System.out.println("Saldo:R$" + minhaConta.saldo);
        
        minhaConta.depositar(200.0);
        System.out.println("Saldo após o depósito:R$" + minhaConta.saldo);
        
        minhaConta.sacar(100.0);
        System.out.println("Saldo após saque:R$" + minhaConta.saldo);

        //Conta.calculaRendimento();
        minhaConta.calculaRendimento();
        System.out.println(minhaConta.recuperaDadosParaImpressao());


        /*Conta c1 = new Conta();
        c1.nome = "Danilo";
        c1.saldo = 100;/* */

        Conta c2 = new Conta();
        c2.nome = "Danilo";
        c2.saldo = 100;

        Conta c1 = new Conta();
        c1.nome = "Hugo";
        c1.saldo = 100;

        c2 = c1;

        if(c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("diferentes");
        }

        //Resposta da questão 4, quando executa o if, retorna o seguinte resultado: diferentes.
        //Resposta da questão 5, quando executa o if, retorna o seguinte resultado iguais.
        //Resposta da questão 7, ocorre o seguinte: Exception in thread "main" java.lang.NullPointerException
        /*Resposta da questão 8, ocorre o seguinte: non-static variable saldo cannot be referenced from a static context
        non-static method calculaRendimento() cannot be referenced from a static context. No caso do saldo, esse erro ocorre porque estou tentando acessar a variavável
        saldo em um método estático. E no caso do calculaRendimento, O acesso deve ser feito por meio de uma instância específica da classe.*/



    }
   
   
}
