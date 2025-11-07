import java.util.*;

public class Main3 {
  public static void main(String[] args) {
    System.out.println("Preço: " + perguntar());
  }

  public static double perguntar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Forneça o preço de um produto: ");
    double input = 0;
    try {
      input = sc.nextDouble();
      if(input < 0) {
        throw new IllegalArgumentException("Inserir valor maior que 0");
      }
      return input;
    } catch (Exception e) {
      System.out.println("Houve um erro: " + e.getMessage());
      perguntar();
      return input;
    }
  }
}
