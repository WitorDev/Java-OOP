package books;

public class Livro {
  public String titulo;
  public String autor;
  public int anoPublicado;

  public Livro(String titulo, String autor, int anoPublicado) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicado = anoPublicado;
  }

  public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    anoPublicado = 2020;
  }

  @Override
  public String toString() {
    return "Título: " + titulo + ", Autor: " + autor + ", Ano Publicado: " + anoPublicado;
  }
}

// 1_Classe chamada Livro com os atributos:
// _Titulo(String)
// _autor(String)
// _anoPublicacao(int)
// *A classe deve conter 2 construtores:
// _Um que receba todos os atributos
// _Outro que receba apenas titulo e autor, e defina anoPublicacao como 2020;
