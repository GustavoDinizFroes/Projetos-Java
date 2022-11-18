package br.com.impacta.testes;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prateleira_digital", "root", "Imp@ct@");
			System.out.println("conectou aoaaoaooaoaoaoa");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_filme");

			while (rs.next()) {
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getInt("codigo"));
			}

			con.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
