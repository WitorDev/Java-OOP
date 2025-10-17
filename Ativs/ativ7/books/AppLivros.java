package books;

public class AppLivros {
// 3_Crie uma classe AppLivros para testar a criação de objetos com os dois tipos de construtores da classe Livro e da classe Ebook.
  public static void main(String[] args) {
    Livro a = new Livro("SQL", "O'Reilly", 2023);
    Livro b = new Livro("Hardcore Java", "O'Reilly");

    Ebook a1 = new Ebook("C", "Lenny Lovold", 1997, 15);
    Ebook b1 = new Ebook("C", "Lenny Lovold", 15);

    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(a1.toString());
    System.out.println(b1.toString());
  }
}
