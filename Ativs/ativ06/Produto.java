public class Produto {
  String nome;
  double preco;
  int quantidade;

  public double valorTotalEstoque() {
    return quantidade * preco;
  }

  public String toString() {
    return String.format(
      "Nome: %s\nPreço: %.2f\nQuantidade: %d\nValor total: %,.2f",
      nome, preco, quantidade, valorTotalEstoque());
  }
}
