package br.com.impacta.testes;

public class TesteArray {

	public static void main(String[] args) {

		String nome1 = "Gustavo";
		String nome2 = "Lucas";
		String nome3 = "Fabio";

		String[] nomes = new String[10];

		nomes[9] = nome1;
		nomes[0] = nome2;
		nomes[1] = nome3;
		
		for (int i = 0; i <= 9; i++) {
			
			System.out.println(i + "...");
		
			}
		}
		
	}

