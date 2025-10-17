import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Instanciar um scanner para entrada de dados do usuário
    Estudante estudante = new Estudante(); // Instanciar um objeto estudante

    System.out.println("Nome do estudante: "); // Solicitar e atribuir nome do aluno
    estudante.nome = sc.nextLine();

    // Solicitar notas do aluno
    System.out.println("Nota do 1 Trimestre (máx = 30): ");
    estudante.nota1 = sc.nextDouble();

    System.out.println("Nota do 2 Trimestre (máx = 35): ");
    estudante.nota2 = sc.nextDouble();

    System.out.println("Nota do 3 Trimestre (máx = 35): ");
    estudante.nota3 = sc.nextDouble();

    // Imprimir os dados do usuário
    System.out.println("\nEstudante: " + estudante.nome + ".");
    System.out.printf("Nota final: %.2f\n", estudante.notaFinal());

    if (estudante.aprovado()) { // Imprimir resultado
      System.out.println("Resultado: Aprovado ✔️");
    } else {
      System.out.println("Resultado: Aprovado ❌");
      System.out.printf("Faltaram %.2f pontos para a provação!", estudante.pontosFaltantes());
    }
    sc.close();
  }
}