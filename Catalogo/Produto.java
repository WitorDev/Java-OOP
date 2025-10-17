public class Produto{
  String nome;
  double preco;
  int quantidadeEmEstoque;

  public Produto(String nome, double preco) {
    try {
      if(nome == null) {
        throw new IllegalArgumentException("Nome não pode ser nulo");
      } else {
        this.nome = nome;
      }
      if(preco < 0) {
        throw new IllegalArgumentException("Preço não pode ser menor que zero nem nulo");
      } else {
        this.preco = preco;
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Impossível criar Produto: " + e.getMessage());
    }
  }
  public Produto(String nome, double preco, int quantidadeEmEstoque) {
    try {
      if(nome == null) {
        throw new IllegalArgumentException("Nome não pode ser nulo");
      } else {
        this.nome = nome;
      }
      if(preco < 0) {
        throw new IllegalArgumentException("Preço não pode ser menor que zero nem nulo");
      } else {
        this.preco = preco;
      }
      if(quantidadeEmEstoque < 0) {
        throw new IllegalArgumentException("quantidadeEmEstoque deve ser maior que zero");
      } else {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Impossível criar Produto: " + e.getMessage());
    }
  }


  public void adicionar(int quantidade) {
    try {
      if(quantidade < 0) {
      throw new IllegalArgumentException("quantidade deve ser maior que zero");
    } else {
      quantidadeEmEstoque += quantidade;
    }
    } catch (IllegalArgumentException e) {
      System.out.println("Impossível adicionar itens: " + e.getMessage());
    }
  }
  public void remover(int quantidade) {
    if (quantidadeEmEstoque < quantidade) {
      System.out.println("Itens insuficientes!");
    } else {
      try {
      if(quantidade < 0) {
      throw new IllegalArgumentException("quantidade deve ser maior que zero");
    } else {
      quantidadeEmEstoque -= quantidade;
    }
    } catch (IllegalArgumentException e) {
      System.out.println("Impossível remover itens: " + e.getMessage());
    }
    }
  }
  public double valorTotal() {
    return preco * quantidadeEmEstoque;
  }
}