public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto("Banana", -3.50, 2);
    Produto produto2 = new Produto("Capinha de Celular", 21.50, 3);

    produto1.adicionar(14);
    produto1.remover(2);
    produto1.adicionar(-21);
    produto1.remover(32);
    produto2.adicionar(14);
    produto1.remover(12);

    System.out.println("Nome: " + produto1.nome + " Preço: " + produto1.preco + " Quantidade: " + produto1.quantidadeEmEstoque + " Total em estoque: " + produto1.preco * produto1.quantidadeEmEstoque);
    System.out.println("Nome: " + produto2.nome + " Preço: " + produto2.preco + " Quantidade: " + produto2.quantidadeEmEstoque + " Total em estoque: " + produto2.preco * produto2.quantidadeEmEstoque);
  }
}
