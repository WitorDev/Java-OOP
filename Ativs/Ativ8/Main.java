import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // funcionário 2
    System.out.println("- Funcionário 1 - ");

    System.out.println("Insira o nome do funcionário 1");
    String nome1 = sc.next();

    System.out.println("Qual seu salário?");
    double salario1 = sc.nextDouble();

    System.out.println("Qual sua função?");
    String funcao1 = sc.next();

    // instanciar funcionário
    Funcionario funcionario1 = new Funcionario(nome1, salario1, funcao1);


    // funcionário 2
    System.out.println("- Funcionário 2 -");

    System.out.println("Insira o nome do funcionário 2");
    String nome2 = sc.next();

    System.out.println("Qual sua função?");
    String funcao2 = sc.next();

    // instanciar funcionário
    Funcionario funcionario2 = new Funcionario(nome2, funcao2);


    // gerente
    System.out.println("- Gerente -");

    System.out.println("Insira o nome do Gerente");
    String nome3 = sc.next();

    System.out.println("Qual seu salário?");
    double salario3 = sc.nextDouble();

    System.out.println("Qual sua função?");
    String funcao3 = sc.next();

    System.out.println("Qual seu departamento?");
    String departamento = sc.next();

    // instanciar gerente
    Funcionario gerente = new Gerente(nome3, salario3, funcao3, departamento);


    // programador
    System.out.println("- Programador -");

    System.out.println("Insira o nome do Programador");
    String nome4 = sc.next();

    System.out.println("Qual seu salário?");
    double salario4 = sc.nextDouble();

    System.out.println("Qual sua função?");
    String funcao4 = sc.next();

    System.out.println("Qual seu linguagem?");
    String linguagem = sc.next();

    // instanciar programador
    Funcionario programador = new Programador(nome4, salario4, funcao4, linguagem);


    // imprimir funcionários na tela
    System.out.println("- " + funcionario1.getNome() + " -");
    System.out.println(funcionario1.toString());

    System.out.println("- " + funcionario2.getNome() + " -");
    System.out.println(funcionario2.toString());

    System.out.println("- " + gerente.getNome() + " -");
    System.out.println(gerente.toString());

    System.out.println("- " + programador.getNome() + " -");
    System.out.println(programador.toString());

    sc.close();
  }
}
