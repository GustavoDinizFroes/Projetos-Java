package br.com.impacta.persistencia;

public class Filme {

	public int codigo;
	public String titulo;
	public String diretores;
	public double nota;
	public int duracao;
	public int ano;
	public String generos;
	public int Votos;
	public String url;

	@Override
	public String toString() {
		return "Filme [codigo=" + codigo + ", titulo=" + titulo + ", diretores=" + diretores + ", nota=" + nota
				+ ", duracao=" + duracao + ", ano=" + ano + ", generos=" + generos + ", numVotos=" + Votos + ", url="
				+ url + "]";
	}

}