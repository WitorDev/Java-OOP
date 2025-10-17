public class Main {
  public static void main(String[] args) {
    Produto produto = new Produto();
    produto.nome = "vafda";
    produto.preco = 1231.12;
    produto.quantidade = 13;

    System.out.println(produto.toString());
  }
}