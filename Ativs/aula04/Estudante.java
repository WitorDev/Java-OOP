public class Estudante {
  // Atributos
  public String nome;
  public double nota1;
  public double nota2;
  public double nota3;

  // Métodos
  public double notaFinal() {
    return (nota1 + nota2 + nota3);
  }

  public boolean aprovado() {
    return notaFinal() >= 70;
  }

  public double pontosFaltantes() {
    if (aprovado()) {
      return 0.0;
    } else {
      return (70 - notaFinal());
    }
  }
}
