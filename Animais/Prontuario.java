public class Prontuario {
  private String condicao; // Condição médica escrita ex.: saudável, infecção urinária, corte superficial
  private String dataUltimoAtendimento; // Data escrita ex.: 15 de outubro 2025

  // construtor
  public Prontuario(String condicao, String dataUltimoAtendimento) {
    this.condicao = condicao;
    this.dataUltimoAtendimento = dataUltimoAtendimento;
  }

  // Métodos acessores
  public String getCondicao() {
    return condicao;
  }
  public String getDataUltimoAtendimento() {
    return dataUltimoAtendimento;
  }
}
