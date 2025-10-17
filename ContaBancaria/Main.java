import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double saldo = 0;

    // pegar dados para conta
    System.out.println("Informe o número da conta: ");
    int numero = sc.nextInt();

    System.out.println("Informe o titular da conta: ");
    String titular = sc.next();

    System.out.println("Possui depósito inicial? (s/n)");
    String resposta = sc.next();

    if(resposta.equals("s")) {
      System.out.println("Informe o valor para o depósito:");
      saldo = sc.nextDouble();
    }

    // instanciar conta
    ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

    System.out.println("Dados da conta:");
    System.out.println(conta.toString());

    // realizar depósito
    System.out.println("Informe o valor para depósito:");
    double adicionarSaldo = sc.nextDouble();
    conta.deposito(adicionarSaldo);

    mostrarDados(conta);

    // realizar saque
    System.out.println("Informe o valor para saque:");
    double removerSaldo = sc.nextDouble();
    conta.saque(removerSaldo);

    mostrarDados(conta);

    sc.close();
  }

  public static void mostrarDados(ContaBancaria conta) {
    System.out.println("Dados da conta atualizados:");
    System.out.println(conta.toString());
  }
}
