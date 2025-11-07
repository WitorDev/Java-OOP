package Conta;

public class ContaCorrente extends Conta {
  @Override
  int getTaxa() {
    return this.total * 2;
  }
}
