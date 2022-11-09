package br.com.impacta.testes;

public class TesteFor {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			
			if(i % 2 == 0) {
				if(i % 10 != 0)
				System.out.println(i + "...");
				
			}
		}
	}

}