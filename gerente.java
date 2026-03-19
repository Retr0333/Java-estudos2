package empresaRH;

import java.util.Scanner;

public class gerente extends funcionario 
{
   
    double salario = 5000;
    public void cargoGerencia()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       nome = sc.nextLine();

       this.exibirDados(this.nome, this.salario);
    }
}
