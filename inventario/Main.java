public class Main {
  public static void main(String[] args) {
    Generico g = new Generico();
    g.adicionarItem("Caneta");
    System.out.println(g.getItem());

    Genericos<String> a = new Genericos<>();
    a.adicionarItem("Borracha");
    System.out.println(a.getItem());

    Genericos<Integer> b = new Genericos<>();
    b.adicionarItem(110);
    System.out.println(b.getItem());

    Genericos<Boolean> c = new Genericos<>();
    c.adicionarItem(true);
    System.out.println(c.getItem());
  }
}
