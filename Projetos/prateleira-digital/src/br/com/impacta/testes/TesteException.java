package br.com.impacta.testes;

public class TesteException {

	public static void main(String[] args) {

		try {
			System.out.println(4 / 0);
			int a = Integer.parseInt("perigo");
		} catch (Exception e) {
			System.out.println("não está tudo bem...");

		}

	}

}
