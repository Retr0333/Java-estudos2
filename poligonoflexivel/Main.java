package poligonoflexivel;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        forma forma1 = null;

        System.out.println("------------Calculo de area-------------\n");
        System.out.println("Digite 1 para calcular retangulo\n");
        System.out.println("Digite 2 para calcular circulo\n");
        System.out.println("Opção desejada: \n");
        int opção = sc.nextInt();

        if(opção == 1)
        {
            System.out.println("Digite a base: ");
            double base = sc.nextDouble();
            System.out.println("Digite a altura");
            double altura = sc.nextDouble();

            forma1 = new retangulo(base, altura);
        }
        else
        {
            System.out.println("Digite o raio: \n");
            double raio = sc.nextDouble();
            forma1 = new circulo(raio);
        }
         System.out.println(" " + forma1.calcularArea() + "");
    }
}
