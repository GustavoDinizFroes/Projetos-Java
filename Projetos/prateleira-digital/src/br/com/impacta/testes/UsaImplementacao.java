package br.com.impacta.testes;

public class UsaImplementacao{
	
	public static void main(String[] args) {
		ImplementaInterface objeto1 = new ImplementaInterface();
		ImplementaInterface2 objeto2 = new ImplementaInterface2();
		
		System.out.println(objeto1.subtrair(10, 5) );
		System.out.println(objeto2.subtrair(10, 5) );
	}

}
