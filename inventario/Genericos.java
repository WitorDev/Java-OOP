public class Genericos<T> {
  private T item;

  public void adicionarItem(T item){
    this.item = item;
  }

  public T getItem() {
    return item;
  }
}