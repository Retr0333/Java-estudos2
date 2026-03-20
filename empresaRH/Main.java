package empresaRH;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        funcionario funcionario1 = new gerente();

        System.out.println("SISTEMA DA EMPRESA");
        System.out.println("Opção 1: Gerente");
        System.out.println("Opção 2:Funcionario comum");
        System.out.println("Digite o numero equivalente a seu cargo: ");
        int cargo = sc.nextInt();

        if(cargo == 1)
        {
            funcionario1.cargoGerencia();
        }
        else
        {
           funcionario1.cargoFuncionario();
        }
    }
}
