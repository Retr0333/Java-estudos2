package empresaRH;

import java.util.Scanner;

public abstract class funcionario 
{
    String nome;
    double salario = 3000;
    public void cargoFuncionario()
    {
          Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        this.exibirDados(this.nome, this.salario);
    }

    public abstract void cargoGerencia();
    


    public void exibirDados(String nome, double salario)
    {
        System.out.println("Seu nome é " +nome+ " e seu salario é " + salario);
    }
} 