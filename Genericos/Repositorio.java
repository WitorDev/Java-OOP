import java.util.*;

public class Repositorio<T extends Produto> {
  private List<T> lista;

  public Repositorio() {
    this.lista = new ArrayList<>();
  }

  public void adicionar(T produto) {
    lista.add(produto);
  }

  public void listarProdutos() {
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
  }

  public T buscarPorCodigo(int codigo) {
    for (T produto : lista) {
      if (produto.getCodigo() == codigo) {
        return produto;
      }
    }
    return null;
  }

  public T buscarMaiorPreco() {
    T produto = lista.get(0);

    // for (int i = 1; i < lista.size(); i++) {
    //   if (lista.get(i).getPreco() > produto.getPreco()) {
    //     produto = lista.get(i);
    //   }
    // }

    for (T p : lista) {
      if (p.getPreco() > produto.getPreco()) {
        produto = p;
      }
    }

    return produto;
  }

  public T buscarMenorPreco() {
    T produto = lista.get(0);

    // for (int i = 1; i > lista.size(); i++) {
    //   if (lista.get(i).getPreco() > produto.getPreco()) {
    //     produto = lista.get(i);
    //   }
    // }

    for (T p : lista) {
      if (p.getPreco() < produto.getPreco()) {
        produto = p;
      }
    }

    return produto;
  }
}
