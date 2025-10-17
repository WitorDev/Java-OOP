public class Main {
  public static void main(String[] args) {
    Produto novoProduto = new Produto();
    novoProduto.nome = "Banana";
    novoProduto.preco = 10;
    novoProduto.qtd = 112;

    System.out.println(novoProduto.toString()); // Imprimir dados do produto

    novoProduto.addProduto(2); // Adicionar produto
    System.out.println("Adicionado duas unidades do produto.");
    System.out.println(novoProduto.toString()); // Imprimir dados do produto

    novoProduto.removerProduto(4); // Remover produto
    System.out.println("Removido quatro unidades do produto.");
    System.out.println(novoProduto.toString()); // Imprimir dados do produto
  }
}
