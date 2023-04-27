package heranca;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double valor_Pedido;
	private double desconto;
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public double getValor_Pedido() {
		return valor_Pedido;
	}



	public void setValor_Pedido(double valor_Pedido) {
		this.valor_Pedido = valor_Pedido;
	}



	public double getDesconto() {
		return desconto;
	}



	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}


	public void calcularDesconto() {
		this.desconto = this.valor_Pedido - (this.valor_Pedido * 0.10);
	}
	
	public void imprimir() {
		System.out.println("Nome: "+this.getNome()+"; Idade: "+this.getIdade()+"; Endereço: "+this.getEndereco());
		System.out.println("Valor do produto: "+this.getValor_Pedido()+"; Valor com desconto: "+this.getDesconto()+";");
		System.out.println("");
	}
}
