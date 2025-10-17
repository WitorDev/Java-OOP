public class ContaBancaria {
  private int numero;
  private String titular;
  private double saldo;

  // constructor
  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  // acessores
  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }

  // class methods
  public void deposito(double quantia) {
    saldo += quantia;
  }

  public void saque(double quantia) {
    saldo -= quantia;
    saldo -= 5;
  }

  @Override
  public String toString() {
    return "Número: " + numero + ", Titular: " + titular + ", Saldo: " + saldo;
  }
}