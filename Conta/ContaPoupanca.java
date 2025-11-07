package Conta;

public class ContaPoupanca extends Conta {
  @Override
  int getTaxa() {
    return this.total * 3;
  }
}
