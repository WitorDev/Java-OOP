import java.util.Scanner;

public class CalculoFigura {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Circulo c = new Circulo();

    System.out.println("Insira o valor do Raio: ");
    c.raio = sc.nextDouble();

    System.out.printf("Circunferência: %.2f ", c.circunferencia());
    System.out.printf("\nVolume: %.2f ", c.volume());
    System.out.printf("\nValor de PI: %.2f", Math.PI);

    sc.close();
  }
}
