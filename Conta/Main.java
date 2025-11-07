package Conta;

public class Main {
  public static void main(String[] args) {
    Conta contaCorrente = new ContaCorrente();
    Conta contaPoupanca = new ContaPoupanca();

    contaCorrente.mostrarValor();
    System.out.println(contaCorrente.getTaxa());

    contaPoupanca.mostrarValor();
    System.out.println(contaPoupanca.getTaxa());
  }
}
