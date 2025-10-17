public class Main {
  public static void main(String[] args) {
    // instanciar um objeto da classe Aluno
    Aluno novoAluno = new Aluno("Jonas Strongman", "33300022211", 34, 82.2, 1.82, "Hipertrofia");
    novoAluno.exibirResumo(); // exibir resumo dos dados do aluno
    System.out.println("IMC do aluno " + novoAluno.nomeCompleto + ": " + novoAluno.calcularIMC()); // imprimir no terminal o IMC do aluno
  }
}
