public class TesteAcesso {
  public static void main(String[] args) {
    Aluno a = new Aluno("João", "123456", 20, "Engenharia");
    System.out.println(a.email);
    System.out.println(a.idade);
    System.out.println(a.nome);
    a.acessarDadosPrivados();
    a.mostrarDadosPublicos();
  }
}
