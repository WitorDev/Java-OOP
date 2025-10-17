public class Circulo {
  double raio;

  public double circunferencia() {
    return 2 * Math.PI * raio;
  }

  public double volume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
  }
}
