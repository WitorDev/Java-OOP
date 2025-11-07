import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] vetor = new String[5];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Informe o nome:");
      vetor[i] = sc.nextLine().trim();
    }
    System.out.println("\n");

    for (int i = vetor.length - 1; i > -1; i--) {
      System.out.println(vetor[i]);
    }
    System.out.println("\n");

    for (String i : vetor) {
      System.out.println(i);
    }
    System.out.println("\n");
  }
}