// Classe Projeto (associação simples com Funcionario)
//     * Atributos: nomeProjeto, prazoEntrega e funcionarioResponsavel.
//     * Construtor para inicializar os atributos.
//     * Método para exibir os detalhes do projeto e do funcionário responsável.

public class Projeto {
  // atributos
  private String nomeProjeto;
  private int prazoEntrega; // em dias
  private Funcionario funcionarioResponsavel;

  // construtor
  public Projeto(String nomeProjeto, int prazoEntrega, Funcionario funcionarioResponsavel) {
    this.nomeProjeto = nomeProjeto;
    this.prazoEntrega = prazoEntrega;
    this.funcionarioResponsavel = funcionarioResponsavel;
  }

  // sobrescrita de toString()
  @Override
  public String toString() {
    return "Nome do projeto: " + nomeProjeto + ", Prazo de Entrega (dias): " + prazoEntrega + ", Funcionário responsável: \n" + funcionarioResponsavel.toString();
  }
}
