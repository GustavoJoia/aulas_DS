package prova;

public class Main {

	public static void main(String[] args) {
		
		TestarFilme filme1 = new TestarFilme("Os Vingadores", 142);
		System.out.println("Exibi��o: "+filme1.getTitulo());
		System.out.println("Dura��o: "+filme1.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme2 = new TestarFilme("Hotel Transilv�nia", 93);
		System.out.println("Exibi��o: "+filme2.getTitulo());
		System.out.println("Dura��o: "+filme2.exibirDuracaoEmHoras());
		System.out.println("");
		
		System.out.println("Os filmes em cartaz s�o:");
		System.out.println("� "+filme1.getTitulo());
		System.out.println("� "+filme2.getTitulo());
		System.out.println("");
		System.out.println("=======================================================");
		System.out.println("");
		
		TestarFilme filme3 = new TestarFilme("Harry Potter e a Pedra Filosofal", 136);
		System.out.println("Exibi��o: "+filme3.getTitulo());
		System.out.println("Dura��o: "+filme3.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme4 = new TestarFilme("As Cr�nicas de N�rnia: Princ�pe Caspian", 150);
		System.out.println("Exibi��o: "+filme4.getTitulo());
		System.out.println("Dura��o: "+filme4.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme5 = new TestarFilme("Eternos", 140);
		System.out.println("Exibi��o: "+filme5.getTitulo());
		System.out.println("Dura��o: "+filme5.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme6 = new TestarFilme("Dois Irm�os", 87);
		System.out.println("Exibi��o: "+filme6.getTitulo());
		System.out.println("Dura��o: "+filme6.exibirDuracaoEmHoras());
		System.out.println("");
		
		TestarFilme filme7 = new TestarFilme("Steven Universe: The Movie", 102);
		System.out.println("Exibi��o: "+filme7.getTitulo());
		System.out.println("Dura��o: "+filme7.exibirDuracaoEmHoras());
		System.out.println("");
		
		System.out.println("Os filmes em cartaz s�o:");
		System.out.println("");
		System.out.println("� "+filme3.getTitulo());
		System.out.println("� "+filme4.getTitulo());
		System.out.println("� "+filme5.getTitulo());
		System.out.println("� "+filme6.getTitulo());
		System.out.println("� "+filme7.getTitulo());
		System.out.println("");

	}

}
