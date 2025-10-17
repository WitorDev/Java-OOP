// Classe Principal (Empresa)
//     * No método main, criar:
//          o Um funcionário usando o primeiro construtor e definir o cargo e o salário pelos métodos assessores.

//          o Outro funcionário usando o segundo construtor.
//          o    Um projeto associando um dos funcionários como responsável.
//          o    Mostrar os dados de todos os objetos criados.

public class Main {
  public static void main(String[] args) {
    // instanciando funcionário por meio do construtor um (nome e cpf)
    Funcionario funcionario = new Funcionario("Bob", "97748338200");
    funcionario.setCargo("Vendedor");
    funcionario.setSalario(3970.00);

    // instanciando funcionário por meio do construtor dois (todos os atributos)
    Funcionario funcionaria = new Funcionario("Jenny", "74453672700", "Secretaria", 3400.00);

    // instanciar projeto realicionando os funcionários
    Projeto projeto = new Projeto("Projeto Cyberg", 130, funcionario);

    // imprimir na tela os dados de cada objeto instanciado
    System.out.println(funcionario.toString());

    System.out.println(funcionaria.toString());

    System.out.println(projeto.toString());
  }
}
