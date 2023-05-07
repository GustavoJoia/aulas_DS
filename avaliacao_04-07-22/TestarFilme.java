package prova;

public class TestarFilme {
	
	private String titulo;
	private int duracaoEmMinutos;
	
	public TestarFilme(String titulo, int duracaoEmMinutos) {
		this.titulo=titulo;
		this.duracaoEmMinutos=duracaoEmMinutos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	
	public String exibirDuracaoEmHoras() {
		return this.duracaoEmMinutos/60+" horas e "+this.duracaoEmMinutos%60+" minutos.";
	}

}
