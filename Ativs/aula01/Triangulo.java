public class Triangulo {
  public double a, b, c;

  public double calcularArea() {
		double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public void mostrarTipo() {
    if( a == b && b == c) {
      System.out.println("O Triângulo é equilátero.");
    } else if (a == b || b == c || c == a) {
      System.out.println("O Triângulo é isóceles.");
    } else {
      System.out.println("O Triângulo é escaleno.");
    }
  }
}
