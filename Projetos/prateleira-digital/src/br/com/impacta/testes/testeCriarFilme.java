package br.com.impacta.testes;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.impacta.controladores.FilmeController;
import br.com.impacta.persistencia.Filme;

public class testeCriarFilme {

	public static void main(String[] args) {
		int margem1 = 100;
		int margem2 = 40;
		FilmeController controller = new FilmeController();

		JFrame frame = new JFrame("Cadastrar Filme:");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton();
		botao.setText("salvar");
		botao.setSize(150, 40);
		botao.setLocation(550, 450);
		frame.add(botao);

		JLabel labeltopo = new JLabel("Gerenciamento de filmes");
		labeltopo.setFont(new Font("Arial", Font.BOLD, 34));
		labeltopo.setBounds(188, 5, 500, 50);
		frame.add(labeltopo);

		JLabel labeltitulo = new JLabel("Título:");
		labeltitulo.setBounds(margem2, 100, 100, 30);
		frame.add(labeltitulo);

		JTextField caixatitulo = new JTextField(20);
		caixatitulo.setBounds(margem1, 100, 200, 30);
		frame.add(caixatitulo);

		JLabel labeldiretores = new JLabel("Diretores:");
		labeldiretores.setBounds(margem2, 150, 100, 30);
		frame.add(labeldiretores);

		JTextField caixadiretores = new JTextField(20);
		caixadiretores.setBounds(margem1, 150, 200, 30);
		frame.add(caixadiretores);

		JLabel labelnota = new JLabel("Nota:");
		labelnota.setBounds(margem2, 200, 200, 30);
		frame.add(labelnota);

		JTextField caixanota = new JTextField(20);
		caixanota.setBounds(margem1, 200, 50, 30);
		frame.add(caixanota);

		JLabel labelduracao = new JLabel("Duração:");
		labelduracao.setBounds(270, 200, 200, 30);
		frame.add(labelduracao);

		JTextField caixaduracao = new JTextField(20);
		caixaduracao.setBounds(325, 200, 50, 30);
		frame.add(caixaduracao);

		JLabel labelano = new JLabel("Ano:");
		labelano.setBounds(170, 200, 200, 30);
		frame.add(labelano);

		JTextField caixaano = new JTextField(20);
		caixaano.setBounds(200, 200, 50, 30);
		frame.add(caixaano);

		JLabel labelgeneros = new JLabel("Gêneros:");
		labelgeneros.setBounds(margem2, 250, 200, 30);
		frame.add(labelgeneros);

		JTextField caixageneros = new JTextField(20);
		caixageneros.setBounds(margem1, 250, 200, 30);
		frame.add(caixageneros);

		JLabel labelnumvotos = new JLabel("Num. de votos:");
		labelnumvotos.setBounds(400, 200, 200, 30);
		frame.add(labelnumvotos);

		JTextField caixanumvotos = new JTextField(20);
		caixanumvotos.setBounds(490, 200, 50, 30);
		frame.add(caixanumvotos);

		JLabel labelurl = new JLabel("URL:");
		labelurl.setBounds(margem2, 300, 200, 30);
		frame.add(labelurl);

		JTextField caixaurl = new JTextField(20);
		caixaurl.setBounds(margem1, 300, 200, 30);
		frame.add(caixaurl);

		frame.setLayout(null);
		frame.setVisible(true);

		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titulo = caixatitulo.getText();
				String diretores = caixadiretores.getText();
				String nota = caixanota.getText();
				String duracao = caixaduracao.getText();
				String ano = caixaano.getText();
				String generos = caixageneros.getText();
				String votos = caixanumvotos.getText();
				String url = caixaurl.getText();
				
				System.out.println("Titulo: " + titulo);
				System.out.println("Diretores: " + diretores);
				System.out.println("Nota: " + nota);
				System.out.println("Duração: " + duracao);
				System.out.println("Ano de lançamento: " + ano);
				System.out.println("Gêneros: " + generos);
				System.out.println("Número de votos: " + votos);
				System.out.println("URL: " + url);
				
				Filme filme = new Filme();
				filme.titulo = titulo;
				filme.diretores = diretores;
				filme.nota = Integer.parseInt(nota);
				filme.duracao = Integer.parseInt(duracao);
				filme.ano = Integer.parseInt(ano);
				filme.generos = generos;
				filme.numVotos = Integer.parseInt(votos);
				filme.url = url;
				
				controller.criar(filme);
				
			}

		});
		
	}

}