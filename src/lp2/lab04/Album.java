package lp2.lab04;

import java.util.ArrayList;

public class Album {
	String titulo_album;
	String artista;
	int ano;
	ArrayList<Musica> musicas = new ArrayList<Musica>();

	public Album(String titulo_album, String artista, int ano) throws Exception {
		if (titulo_album.equals("") || titulo_album.equals(null)) {
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");
		}
		this.titulo_album = titulo_album;
		if (artista.equals("") || artista.equals(null)) {
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
		this.artista = artista;
		if (ano <= 1900) {
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");
		}
		this.ano = ano;
	}

	public boolean adicionaMusica(Musica musica) {
		musicas.add(musica);
		return true;
	}
	
	public int quantidadeFaixas() {
		return musicas.size();
	}

	public Object getDuracaoTotal() {
		int duracaoTotal = 0;
		for (int i = 0; i < quantidadeFaixas(); i++) {
			duracaoTotal += musicas.get(i).getDuracao();
		}
		return duracaoTotal;
	}

	public void removeMusica(int posicao) {
		musicas.remove(posicao);
	}

	public boolean contemMusica(String nome) {
		if (musicas.indexOf(nome) > -1) {
			return true;
		} else {
			return false;
		}
	}

	public Object getMusica(String string) {
		return null;
	}

	public String getTitulo_album() {
		return titulo_album;
	}

	public void setTitulo_album(String titulo_album) {
		this.titulo_album = titulo_album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		return titulo_album + ", " + artista + " " + "(" + ano + ")";

	}

}
