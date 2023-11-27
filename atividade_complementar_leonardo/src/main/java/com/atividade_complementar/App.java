package com.atividade_complementar;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
    Profissional profissional = new Profissional("Scrum Master");
    Profissional profissional2 = new Profissional("Gerente");

    Pessoa pessoa1 = new Pessoa("Maria", 22, "81993220100");
    System.out.println("Nome: " + pessoa1.getNome() + " | Idade: " + pessoa1.getIdade() + " | Profissão: " + profissional.getProfissao() + " | Telefone: " + pessoa1.getTelefone());

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Julia");
    pessoa2.setIdade(35);
    System.out.println("Nome: " + pessoa2.getNome() + " | Idade: " + pessoa2.getIdade() + " | Profissão: " + profissional2.getProfissao() + " | Telefone: " + pessoa2.getTelefone());

    Cliente cliente1 = new Cliente("Maria", 22, "81993220100", "Rua da Alegria", 123, "Felicidade");
    System.out.println("Nome: " + cliente1.getNome() + " | Idade: " + cliente1.getIdade() + " | Telefone: " + cliente1.getTelefone());
    System.out.println("Endereço completo: " + cliente1.getEnderecoCompleto());
}

}