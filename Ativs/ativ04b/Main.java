public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();

		pessoa.nome = "Isaque";
		pessoa.idade = 24;
    pessoa.apresentar();

    System.out.println("");

		funcionario.nome = "Marcos";
		funcionario.idade = 21;
		funcionario.cargo = "Desenvolvedor";
		funcionario.salario = 5000.00;
    funcionario.aumentarSalario(10);
    funcionario.trabalhar();
    funcionario.apresentar();
  }
}