package time;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        //Entrada dos dados
        
        System.out.println("Digite o nome do clube: ");
        System.out.println("\n");
        String nome = sc.nextLine();
        
        System.out.println("Digite o total de vitorias: ");
        System.out.println("\n");
        int vitorias = sc.nextInt();
        
        System.out.println("Digite o total de derrotas: ");
        System.out.println("\n");
        int derrotas = sc.nextInt();
        
        System.out.println("Digite o total de empates: ");
        System.out.println("\n");
        int empates = sc.nextInt();
        
        clubefutebol clube = new clubefutebol("Flamengo", 14, 3, 4);
        
        System.out.println("\n------------------Dados do clube-----------------------");
        System.out.println("Total de jogos\n: ", clube.jogos());
        System.out.println("Pontos ganhos: ", clube.pontosGanhos());
        System.out.println("Pontos perdidos: ", clube.pontosPerdidos());
        System.out.println("Aproveitamento: ", clube.aproveitamento());
        
        
        
        
        
	}
}
