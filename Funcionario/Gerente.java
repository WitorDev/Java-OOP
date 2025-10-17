public class Gerente extends Funcionario{
  private String senha;

  public Gerente() {}

  public Gerente(String nome, double salario, String senha) {
    super(nome, salario);
    this.senha = senha;
  }

  public String getSenha() { return senha; }
  public void setSenha(String senha) { this.senha = senha; }

  public boolean autenticar(String senha) {
    return this.senha != null && this.senha.equals(senha);
  }

  @Override
  public double getBonificacao() { return getSalario() * 0.2; }

  @Override
  public String toString() {
    return super.toString() + " Senha: " + senha;
  }

}
