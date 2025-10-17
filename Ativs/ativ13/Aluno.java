public class Aluno {
  public String nome;
  private String matricula;
  protected int idade;
  String email;

  // construtor
  public Aluno(String nome, String matricula, int idade, String email) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
    this.email = email;
  }

  // métodos

  public void mostrarDadosPublicos() {
    System.out.println("Nome: " + nome);
  }

  private void mostrarTodosDados() {
    System.out.println("Matrícula: " + matricula);
  }

  public void acessarDadosPrivados() {
    mostrarTodosDados();
  }
}