package prova;

public class Main {

	public static void main(String[] args) {
		
		TestarFilme filme1 = new TestarFilme("Os Vingadores", 142);
		System.out.println("Exibição: "+filme1.getTitulo());
		System.out.println("Duração: "+filme1.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme2 = new TestarFilme("Hotel Transilvânia", 93);
		System.out.println("Exibição: "+filme2.getTitulo());
		System.out.println("Duração: "+filme2.exibirDuracaoEmHoras());
		System.out.println("");
		
		System.out.println("Os filmes em cartaz são:");
		System.out.println("— "+filme1.getTitulo());
		System.out.println("— "+filme2.getTitulo());
		System.out.println("");
		System.out.println("=======================================================");
		System.out.println("");
		
		TestarFilme filme3 = new TestarFilme("Harry Potter e a Pedra Filosofal", 136);
		System.out.println("Exibição: "+filme3.getTitulo());
		System.out.println("Duração: "+filme3.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme4 = new TestarFilme("As Crônicas de Nárnia: Princípe Caspian", 150);
		System.out.println("Exibição: "+filme4.getTitulo());
		System.out.println("Duração: "+filme4.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme5 = new TestarFilme("Eternos", 140);
		System.out.println("Exibição: "+filme5.getTitulo());
		System.out.println("Duração: "+filme5.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme6 = new TestarFilme("Dois Irmãos", 87);
		System.out.println("Exibição: "+filme6.getTitulo());
		System.out.println("Duração: "+filme6.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme7 = new TestarFilme("Steven Universe: The Movie", 102);
		System.out.println("Exibição: "+filme7.getTitulo());
		System.out.println("Duração: "+filme7.exibirDuracaoEmHoras());
		System.out.println("");
		
		System.out.println("Os filmes em cartaz são:");
		System.out.println("");
		System.out.println("— "+filme3.getTitulo());
		System.out.println("— "+filme4.getTitulo());
		System.out.println("— "+filme5.getTitulo());
		System.out.println("— "+filme6.getTitulo());
		System.out.println("— "+filme7.getTitulo());
		System.out.println("");

	}

}
