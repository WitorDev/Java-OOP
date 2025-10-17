package books;

public class Ebook extends Livro {
  public double tamanhoArquivo; // MB

  public Ebook(String titulo, String autor, int anoPublicado, double tamanhoArquivo) {
    super(titulo, autor, anoPublicado);
    this.tamanhoArquivo = tamanhoArquivo;
  }

  public Ebook(String titulo, String autor, double tamanhoArquivo) {
    super(titulo, autor);
    this.tamanhoArquivo = tamanhoArquivo;
  }

  @Override
  public String toString() {
    return super.toString() + ", Tamanho do Arquivo: " + tamanhoArquivo;
  }
}

// 2_Crie uma classe Ebook que herda de Livro e tem mais um atributo:
// _tamanhoArquivo( em MB, tipo double)
// Implemente um construtor em Ebook que utiliza super para chamar o construtor da classe livro.
