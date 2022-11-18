package br.com.impacta.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
	// criar (c)
	public void criar(Filme filme) {
	}

	// listar (R)
	public List listar() {

		List<Filme> galeria = new ArrayList();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prateleira_digital", "root",
					"Imp@ct@");
			System.out.println("conectou aoaaoaooaoaoaoa");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_filme");

			while (rs.next()) {
				Filme filme = new Filme();
				filme.titulo = rs.getString("titulo");
				filme.codigo = rs.getInt("codigo");
				filme.diretores = rs.getString("diretores");
				filme.nota = rs.getDouble("nota");
				filme.duracao = rs.getInt("duracao");
				filme.ano = rs.getInt("ano");
				filme.generos = rs.getString("generos");
				filme.Votos = rs.getInt("votos");
				filme.url = rs.getString("url");

				galeria.add(filme);
			}

			con.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return galeria;
	}

	// atualiza
	public void atualizar() {

	}

	// remover
	public void remover(int codigo) {

	}

}
