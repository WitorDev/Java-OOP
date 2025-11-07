
public class Main {
  public static void main(String[] args) {
    Repositorio<Produto> repositorio = new Repositorio<>();
    repositorio.adicionar(new Produto(1, "Banana", 22.10));
    repositorio.adicionar(new Produto(2, "Jorge", 12.2));
    repositorio.adicionar(new Produto(3, "Mouse", 746));
    repositorio.adicionar(new Produto(4, "Jurubebas Doces", 425.44));

    repositorio.listarProdutos();

    divisao();

    System.out.println("Buscar por código: ");
    Produto busca = repositorio.buscarPorCodigo(2);
    System.out.println(busca != null ? busca : "Não encontrado");

    divisao();

    System.out.println("Produto maior preço: ");
    Produto produtoMaiorPreco = repositorio.buscarMaiorPreco();
    System.out.println(produtoMaiorPreco);

    divisao();

    System.out.println("Produto menor preço: ");
    Produto produtoMenorPreco = repositorio.buscarMenorPreco();
    System.out.println(produtoMenorPreco);
  }

  public static void divisao() {
    System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
  }
}