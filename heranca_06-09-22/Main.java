package heranca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Cliente Gustavo = new Cliente();
		ClientePremium Luana = new ClientePremium();
		
		System.out.println("============== Registro de clientes ====================\n");
		System.out.println("O cliente a ser registrado, é premium? [SIM/NÃO]");
		String r = in.next();
		
		if(r.equalsIgnoreCase("SIM")) {
			System.out.println("Informe...");
			System.out.println("Nome: ");
			Luana.setNome(in.next());
			System.out.println("Idade:");
			Luana.setIdade(in.nextInt());
			System.out.println("Endereço: ");
			Luana.setEndereco(in.nextLine());
			Luana.setEndereco(in.nextLine());
			System.out.println("Valor do produto:");
			Luana.setValor_Pedido(in.nextDouble());
			
			Luana.calcularDesconto();
			Luana.imprimir();
			
		}else {
			System.out.println("Informe...");
			System.out.println("Nome: ");
			Gustavo.setNome(in.next());
			System.out.println("Idade:");
			Gustavo.setIdade(in.nextInt());
			System.out.println("Endereço: ");
			Gustavo.setEndereco(in.nextLine());
			Gustavo.setEndereco(in.nextLine());
			System.out.println("Valor do produto:");
			Gustavo.setValor_Pedido(in.nextDouble());
			
			Gustavo.calcularDesconto();
			Gustavo.imprimir();
		}
		
		in.close();
		
	}

}
