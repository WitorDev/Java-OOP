public class Aluno {
    // nome
    String nomeCompleto;
    // cpf
    String CPF;
    // idade
    int idade;
    // peso
    double peso;
    // altura
    double altura;
    // plano de treino
    String planoDeTreino;

    // construtor
    public Aluno(String nomeCompleto, String  CPF, int idade, double peso, double altura, String planoDeTreino) {
      this.nomeCompleto = nomeCompleto;
      this.CPF = CPF;
      this.idade = idade;
      this.peso = peso;
      this.altura = altura;
      this.planoDeTreino = planoDeTreino;
    }

    // calcular IMC
    public double calcularIMC() {
      return peso / (altura * altura);
    }
    // resumo
    public void exibirResumo() {
      System.out.println("--------------------------");
      System.out.println("Aluno: " + nomeCompleto);
      System.out.println("CPF: " + CPF);
      System.out.println("Idade: " + idade);
      System.out.println("Peso: " + peso);
      System.out.println("Altura: " + altura);
      System.out.println("Plano: " + planoDeTreino);
      System.out.println("--------------------------");
    }
}
