public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();

    pessoa.nome = "rojerio com jota";
    pessoa.idade = 109;

    aluno.nome = "jiovana com jota";
    aluno.idade = -30;
    aluno.curso = "Enjenharia com jota";

    System.out.println("===========================");
    pessoa.apresentar();
    System.out.println("===========================");
    aluno.apresentar();
    System.out.println("===========================");
  }
}
