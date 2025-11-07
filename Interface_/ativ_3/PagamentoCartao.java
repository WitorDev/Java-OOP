class PagamentoCartao implements Pagamento {
	private double taxa; // entre 0 e 1

	public PagamentoCartao(double taxa) {
		if (taxa < 0 || taxa > 1)
			throw new IllegalArgumentException("A taxa do cartão deve estar entre 0 e 1.");
		this.taxa = taxa;
	}

	@Override
	public double taxaAplicada() {
		return taxa;
	}

	@Override
	public void pagar(double valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor deve ser maior que 0.");
		System.out.println(recibo(valor));
	}
}