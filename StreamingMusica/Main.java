package StreamingMusica;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        CatalogoT <Midia> midia = new CatalogoT<>();
        int opção = 0;

        while(opção != 4)
        {
            System.out.println("--------TABELA STREAMING DE MUSICA-----------");
            System.out.println("1- Adicionar musica");
            System.out.println("2- Adicionar podcast");
            System.out.println("3- Ver relatório");
            System.out.println("4- Sair do programa");
            opção = sc.nextInt();
            sc.nextLine();

            if(opção == 1)
            {
                System.out.println("Diga o nome do artista");
                String artista = sc.nextLine();

                System.out.println("Diga o nome da musica");
                String titulo = sc.nextLine();

                System.out.println("Diga o numero de reproduções da musica");
                int reproduções = sc.nextInt();
                sc.nextLine();

                midia.adicionar(new Musica(artista, titulo, reproduções));
            }
            if(opção == 2)
            {
                System.out.println("Diga o nome do podcaster");
                String artista = sc.nextLine();
                System.out.println("Digite o nome do titulo");
                String titulo = sc.nextLine();
                System.out.println("Diga quantos minutos ouvidos o podcast teve");
                int minutosOuvidos = sc.nextInt();
                sc.nextLine();

                midia.adicionar(new Podcast(artista, titulo, minutosOuvidos));
            }
            if(opção == 3)
            {
                midia.mostrarRelatorio();
            }
        }
    }
}
