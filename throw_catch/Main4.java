import java.util.*;

public class Main4 {
  public static void main(String[] args) {
    System.out.println(perguntar());
  }

  public static double perguntar() {
    double input = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor numérico:");

    try {
      input = sc.nextDouble();
      return input;
    } catch (InputMismatchException e) {
      System.out.println("Ocorreu um erro: " + e);
      perguntar();
      return input;
    } finally {
      sc.close();
    }
  }
}