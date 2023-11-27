package com.atividade4_14;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Programa 1 - Atividade 4.14(Fixando o Conhecimento)
        Pessoa pessoa = new Pessoa("Maria", 18);

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        pessoa.fazAniversario();

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        pessoa.fazAniversario();

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        /*//Programa 2 - Atividade 4.14(Fixando o Conhecimento)
        Porta porta = new Porta();

        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.pinta("preto");
        System.out.println("A nova cor da porta: " + porta.cor);

        porta.dimensaoX = 1.0;
        porta.dimensaoY = 2.0;
        porta.dimensaoZ = 0.2;

        System.out.println("As novas dimensões da porta:" + porta.dimensaoX + ", " + porta.dimensaoY + ", " + porta.dimensaoZ); */

        /*//Programa 3 - Atividade 4.14(Fixando o Conhecimento)
        Casa casa = new Casa();

        casa.pinta("Lilás");
        
        casa.porta1 = true;
        casa.porta2 = false;
        casa.porta3 = false;

        int portasAbertas = casa.quantasPortasEstaoAbertas();
        System.out.println("Quantidade de portas abertas: " + portasAbertas);*/

    }
}
