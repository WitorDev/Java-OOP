import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== Cadastro de Mamífero ===");

    System.out.println("Nome do animal: ");
    String nome = sc.nextLine();

    System.out.println("Idade: ");
    int idade = sc.nextInt();
    sc.nextLine();

    System.out.println("Espécie: ");
    String especie = sc.next();
    sc.nextLine();

    System.out.println("Possui pelo? (true/false): ");
    String possuiPeloString = sc.next();
    sc.nextLine();
    boolean possuiPelo;

    if(possuiPeloString.equals("true")) {
      possuiPelo = true;
    } else {
      possuiPelo = false;
    }

    System.out.println("Nome do zelador: ");
    String nomeZelador = sc.nextLine();

    System.out.println("CPF do zelador: ");
    String cpfZelador = sc.nextLine();

    Zelador zelador = new Zelador(nomeZelador, cpfZelador);
    Animal mamifero = new Mamifero(nome, idade, especie, possuiPelo, zelador);


    System.out.println("=== Cadastro de Ave ===");

    System.out.println("Nome do animal: ");
    String nomeAve = sc.nextLine();

    System.out.println("Idade: ");
    int idadeAve = sc.nextInt();
    sc.nextLine();

    System.out.println("Espécie: ");
    String especieAve = sc.nextLine();

    System.out.println("Tipo de bico: ");
    String tipoBico = sc.nextLine();

    System.out.println("Nome do zelador: ");
    String nomeZeladorAve = sc.nextLine();

    System.out.println("CPF do zelador: ");
    String cpfZeladorAve = sc.nextLine();

    Zelador zeladorAve = new Zelador(nomeZeladorAve, cpfZeladorAve);
    Animal ave = new Ave(nomeAve, idadeAve, especieAve, tipoBico, zeladorAve);

    System.out.println("=== Animais Cadastrados ===");
    System.out.println(mamifero.toString());
    System.out.println(ave.toString());

    sc.close();
  }
}
