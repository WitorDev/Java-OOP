public class ConverteMoeda {
  public double comprarDolar(double quantidade, double dolar) {
    return quantidade * dolar;
  }

  public double inserirIOF(double valor) {
    return (valor * 0.06) + valor;
  }
}