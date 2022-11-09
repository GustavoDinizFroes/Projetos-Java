package br.com.impacta.testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteSwing2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("mi bebito fiu fiu");
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		JButton botao = new JButton("caramelo");
		botao.setSize(200, 30);
		botao.setLocation(150, 50);

		JButton botao2 = new JButton("de chocolate");
		botao2.setSize(200, 30);
		botao2.setLocation(150, 100);

		JButton botao3 = new JButton("empapame asi");
		botao3.setSize(200, 30);
		botao3.setLocation(150, 150);

		frame.add(botao);
		frame.add(botao2);
		frame.add(botao3);
		
		botao3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Fechando, tchau...");
				
			}
		
		});
		
	
	}
}
