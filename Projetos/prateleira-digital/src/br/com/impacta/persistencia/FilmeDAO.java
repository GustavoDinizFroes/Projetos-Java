package br.com.impacta.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
	
	List<Filme> galeria = new ArrayList();
	
	//criar (C)
	public void criar(Filme filme){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectou aoaoaooa!");
			
			String sql = "INSERT INTO tb_filme (titulo, ano, generos, nota, duracao, votos, diretores, url) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, filme.getTitulo());
			pstmt.setInt(2, filme.getAno());	
			pstmt.setString(3, filme.getGeneros());	
			pstmt.setDouble(4, filme.getNota());	
			pstmt.setInt(5, filme.getDuracao());	
			pstmt.setInt(6, filme.getVotos());	
			pstmt.setString(7, filme.getDiretores());	
			pstmt.setString(8, filme.getUrl());
			
			pstmt.executeUpdate();
		
		
			con.close();
			pstmt.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	//listar (R)
	public List<Filme> listar(){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_filme;");			
			while(rs.next()) {
				Filme filme = new Filme();
				filme.setCodigo(rs.getInt("codigo"));
				filme.setTitulo(rs.getString("titulo"));
				filme.setGeneros(rs.getString("generos"));
				filme.setDiretores(rs.getString("diretores"));
				filme.setUrl(rs.getString("url"));
				filme.setVotos(rs.getInt("votos"));
				filme.setNota(rs.getDouble("nota"));
				filme.setAno(rs.getInt("ano"));
				filme.setDuracao(rs.getInt("duracao"));

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
	
	//atualizar (U)
	public void atualizar(Filme filme) {
		
	}
	
	
	//remover (D)
	public void remover(int codigo) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://172.16.23.9:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("Conectado com sucesso!");
			
			Statement stmt = con.createStatement();
			stmt.execute("delete  from tb_filme where codigo = " + codigo);
		} catch (SQLException e) {
			e.printStackTrace(); 
		} 
	}
}
