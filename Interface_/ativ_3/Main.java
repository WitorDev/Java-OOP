public class Main {
	public static void main(String[] args) {
		Pagamento p1 = new PagamentoCartao(0.029);
		Pagamento p2 = new PagamentoPix();

		System.out.println("-- PAGAMENTO COM: Cartão --");
		p1.pagar(100.0);

		System.out.println("-- PAGAMENTO COM: Pix --");
		p2.pagar(100.0);
	}
}
