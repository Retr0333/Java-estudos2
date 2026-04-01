package CompetiçãodeJogos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import static java.lang.System.out;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        EquipeT <Atleta> equipe = new EquipeT<>();
    
        System.out.println("--------COMPETIÇÃO DE JOGOS---------------");
        System.out.println("Digite 1 se é um nadador");
        System.out.println("Digite 2 se é um corredor");
        System.out.println(":");
        int escolha = sc.nextInt();
        sc.nextLine();

        if(escolha == 1)
        {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite seu tempo: ");
            double tempo = sc.nextDouble();

            equipe.adicionar(new Nadador(nome, tempo));
        }
        else
        {
             System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
           ;

            System.out.println("Digite sua velocidade: ");
            double velocidade = sc.nextDouble();

            equipe.adicionar(new Corredor(nome, velocidade));
        }
        equipe.mostrarResultado();
    }
}
