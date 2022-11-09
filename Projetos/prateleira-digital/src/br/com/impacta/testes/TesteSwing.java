package br.com.impacta.testes;

import javax.swing.JOptionPane;

public class TesteSwing {

	public static void main(String[] args) {
		String mensagem = JOptionPane.showInputDialog("Valor A");
		
		String mensagem2 = JOptionPane.showInputDialog("Valor B");
		
		int um = 0;
		int dois = 0;
		
		try {
			um = Integer.parseInt (mensagem);
			dois = Integer.parseInt (mensagem2);
		}catch(Exception escrevedireito) {
		JOptionPane.showMessageDialog(null, "escreve direito analfabeto");
		}
		
		
		
		int soma = um + dois;
		
		JOptionPane.showConfirmDialog (null, soma);

		
	}

}