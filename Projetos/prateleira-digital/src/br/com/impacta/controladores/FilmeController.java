package br.com.impacta.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import br.com.impacta.persistencia.Filme;
import br.com.impacta.persistencia.FilmeDAO;

public class FilmeController {

	public List<Filme> galeria = new ArrayList<Filme>();

	// criar
	public void criar(Filme filme, DefaultTableModel modelo) {
		galeria.add(filme);
		modelo.addRow(new Object[] { filme.titulo, filme.ano });

		// for (Filme f : galeria) {
		// System.out.println(f);
		// }

		System.out.println("O número de filmes criados é: " + galeria.size());
	}

	// consultar
	public Filme[] consultar(String titulo) {
		// TODO: implementar
		return null;
	}

	// importar
	public int importar(String url) {
		// TODO: implementar
		return 0;
	}

	// remover
	public boolean remover(String titulo) {
		// TODO: implementar
		return false;
	}

	// sortear
	public Filme sortear(String genero) {
		// TODO: implementar
		// Filme []filmes = {}; //500
		// int posicao = (int) (Math.random() * 500);
		// return filmes[0];
		return null;
	}

	public List listar() {
		FilmeDAO dao = new FilmeDAO();
		List retorno = dao.listar();
		return retorno;
	}
}
