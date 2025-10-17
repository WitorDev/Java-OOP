package ativ12a;
public class Main {
  public static void main(String[] args) {
    // instanciar objetos Pessoa e Endereco
    Endereco endereco = new Endereco("Pindamonhangaba", 12, "Águas Azuis", "São Paulo", "São Paulo");
    Pessoa pessoa = new Pessoa("Joãozinho", "03374883900", endereco);

    // mostrar informações da pessoa
    System.out.println(pessoa.toString());;
  }
}