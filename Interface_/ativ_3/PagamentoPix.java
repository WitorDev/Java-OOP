class PagamentoPix implements Pagamento {
	@Override
	public void pagar(double valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor deve ser maior que 0.");
		System.out.println(recibo(valor));
	}
}
