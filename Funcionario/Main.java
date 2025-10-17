public class Main {
  public static void main(String[] args) {
    Funcionario g = new Gerente("Bia", 5000.0, "1234");
    Funcionario f = new Funcionario("Carlos", 2500.0);
    Funcionario s = new Secretario("João", 1500.0);

    System.out.println(g.getNome());
    System.out.println(g.getSalario());
    System.out.println(g.getBonificacao());

    System.out.println(f);
    System.out.println(g);
    System.out.println(s);
  }
}
