package br.com.impacta.testes;

import java.util.ArrayList;
import java.util.List;

public class TesteInterface {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add("gustavo");
		lista.add("pique");
		lista.add("paolo");
		System.out.println(lista);
		
		lista.remove ("gustavo");
		System.out.println(lista);
		
		lista.clear();
		System.out.println(lista);
	
		System.out.println(lista.indexOf("pique"));
		
	}

}
