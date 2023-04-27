package heranca;

public class ClientePremium extends Cliente {

	@Override
	public void calcularDesconto() {
		double desconto;
		desconto = super.getValor_Pedido() - (0.15 * super.getValor_Pedido());
		this.setDesconto(desconto);
	}

}
