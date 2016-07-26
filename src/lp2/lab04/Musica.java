/* 115210160 - Matheus Andrade Rodrigues -  LAB04 */

package lp2.lab04;

/*
 * aqui ficará o Construtor, Gets, Sets, toString...
 */
public class Musica {

	String titulo;
	int duracao;
	String genero;

	public Musica(String titulo, int duracao, String genero) throws Exception {
		if (titulo.equals("") || titulo.equals(null)) {
			throw new Exception("Digite um titulo diferente de \"\".");
		}
		this.titulo = titulo;
		if (duracao <= 0) {
			throw new Exception("Digite uma duracao acima de zero.");
		}
		this.duracao = duracao;
		if (genero.equals("") || genero.equals(null)) {
			throw new Exception("Digite um genero diferente de \"\".");
		}
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		return titulo + " (" + genero + " - " + duracao + " minutos)";
	}

}
