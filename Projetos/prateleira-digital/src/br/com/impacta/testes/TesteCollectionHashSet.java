package br.com.impacta.testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteCollectionHashSet {

	public static void main(String[] args) {
		Set conjunto = new HashSet();

		conjunto.add("gustavo");
		conjunto.add("pique");
		conjunto.add("paolo");
		conjunto.add("paolo");

		System.out.println(conjunto);

		System.out.println(conjunto.size());
		conjunto.remove("gustavo");

		conjunto.clear();
		System.out.println(conjunto);

	}

}
