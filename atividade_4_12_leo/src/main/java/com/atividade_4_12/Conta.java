package com.atividade_4_12;

//Questões da lista 4.12
public class Conta {
    public String nome;
    public String agencia;
    public int numeroConta;
    public Data dataAbertura;
    public double saldo;

    public Conta(String nome, String agencia, int numeroConta, Data dataAbertura, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("O saque no valor de:R$" + valor + " " + "foi realizado com sucesso!");
        } else {
            System.out.println("Não há saldo suficiente para este saque.");
        }
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito no valor de:R$" + valor + " " + "foi realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void calculaRendimento() {
        double rendimento = saldo * 0.1;
        System.out.println("O valor do rendimento mensal é:R$" + rendimento);
    }

    public String recuperaDadosParaImpressao() {
        //String dadosConta = "Titular da conta:" + nome + " " + "Número da conta:" + numeroConta + " Agência:" + agencia + " Data de Abertura da conta:" + dataAbertura.dia + "/" + dataAbertura.mes + "/" + dataAbertura.ano +
        //" Saldo:R$" + saldo;
        //return dadosConta;
        String dados = "\nTitular: " + this.nome;
        /*dados += "\nDia: " + this.dataAbertura.dia;
        dados += "\nMês: " + this.dataAbertura.mes;
        dados += "\nAno: " + this.dataAbertura.ano;*/
        dados += "\nData da Abertura: " + this.dataAbertura.dataFormatada();
        
        return dados;
    }
    public Conta() {

    }
}