public class Produto {
  String nome;
  double preco;
  int qtd;

  public double totalValorEstoque() {
    return qtd * preco;
  }

  public void addProduto(int qtd) {
    qtd++;
  }

  public void removerProduto(int qtd) {
    qtd--;
  }

  @Override
  public String toString() {
    return String.format(
      "Nome: %s, Preço: %.2f, Quantidade: %d",
      nome, preco, qtd);
  }
}
