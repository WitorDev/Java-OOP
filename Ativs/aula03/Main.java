package aula02; // pkg
// imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Instanciar objeto Scanner

    // Criar novo funcionário
    System.out.println("-- Novo funcionário --");
    System.out.println("Insira seu nome:"); // Entrada do nome do funcionário
    String novoNome = sc.nextLine();
    System.out.println("Insira seu salário:"); // Entrada do salário do funcionário
    double novoSalario = sc.nextDouble();
    System.out.println("Insira o imposto:"); // Entrada do imposto do funcionário
    double novoImposto = sc.nextDouble();

    // Criar novo funcionário com as entradas do usuário
    Funcionario novoFuncionario = new Funcionario(novoNome, novoSalario, novoImposto);

    // Mostrar dados do funcionário
    System.out.println(novoFuncionario.toString());

    // Aumentar o salário do funcionário com base na entrada (porcentagem) passada pelo usuário
    System.out.println("Quanto gostaria de adicionar ao salário do funcionário? (Porcentagem)");
    double porcentagem = sc.nextDouble();
    novoFuncionario.aumentarSalario(porcentagem);
    System.out.println("Foi adicionado ao funcionário " + porcentagem + "% ao seu salário.");
  }
}