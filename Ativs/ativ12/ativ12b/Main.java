package ativ12b;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    public boolean on = true;

    while(on) {
      showMenu();
    }

    sc.close();
  }

  public static void showMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Criar departamento (1): ");
    System.out.println("Criar funcionário (2): ");
    sc.next();

  }
}
