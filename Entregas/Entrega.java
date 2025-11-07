// 3. Desenvolva um sistema simples para controle de entregas de
// pedidos.

// Crie uma classe abstrata chamada Entrega com:

// atributo codigoPedido (String);

// método abstrato calcularValorFrete();

// método concreto exibirResumo() que mostra o código e o
// valor final do frete.


public abstract class Entrega {
  private String codigoPedido;

  public Entrega() {}
  public Entrega(String codigoPedido) {
    this.codigoPedido = codigoPedido;
  }

  public abstract double calcularValorFrete();

  public String exibirResumo() {
    return "Código: " + codigoPedido;
  }
}