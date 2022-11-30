import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.ImageIcon;

public class Tela extends JFrame{
		public Tela() {
			getContentPane().setLayout(null);
			
			JButton button = new JButton("4");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(444444);
				}
			});
			button.setBounds(215, 113, 41, 29);
			getContentPane().add(button);
			
			JButton button_1 = new JButton("5");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(555555);
				}
			});
			button_1.setBounds(266, 113, 41, 29);
			getContentPane().add(button_1);
			
			JButton button_2 = new JButton("6");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(666666);
				}
			});
			button_2.setBounds(317, 113, 41, 29);
			getContentPane().add(button_2);
			
			JButton button_3 = new JButton("1");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(11111);
				}
			});
			button_3.setBounds(215, 73, 41, 29);
			getContentPane().add(button_3);
			
			JButton button_1_1 = new JButton("2");
			button_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(222222);
				}
			});
			button_1_1.setBounds(266, 73, 41, 29);
			getContentPane().add(button_1_1);
			
			JButton button_2_1 = new JButton("3");
			button_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(333333);
				}
			});
			button_2_1.setBounds(317, 73, 41, 29);
			getContentPane().add(button_2_1);
			
			JButton button_4 = new JButton("7");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(7777777);
				}
			});
			button_4.setBounds(215, 153, 41, 29);
			getContentPane().add(button_4);
			
			JButton button_1_2 = new JButton("8");
			button_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(8888888);
				}
			});
			button_1_2.setBounds(266, 153, 41, 29);
			getContentPane().add(button_1_2);
			
			JButton button_2_2 = new JButton("9");
			button_2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(9999999);
				}
			});
			button_2_2.setBounds(317, 153, 41, 29);
			getContentPane().add(button_2_2);
			
			JButton button_1_2_1 = new JButton("0");
			button_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(000000);
				}
			});
			button_1_2_1.setBounds(266, 193, 41, 29);
			getContentPane().add(button_1_2_1);
			
			JButton btnNewButton = new JButton("Branco");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(134, 233, 91, 29);
			getContentPane().add(btnNewButton);
			
			JButton btnCorrige = new JButton("Corrige");
			btnCorrige.setBackground(Color.RED);
			btnCorrige.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCorrige.setBounds(240, 233, 91, 29);
			getContentPane().add(btnCorrige);
			
			JButton btnNewButton_1_1 = new JButton("Confirma");
			btnNewButton_1_1.setBackground(Color.GREEN);
			btnNewButton_1_1.setBounds(341, 233, 91, 29);
			getContentPane().add(btnNewButton_1_1);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBorder(UIManager.getBorder("ComboBox.border"));
			panel.setBounds(10, 22, 170, 185);
			getContentPane().add(panel);
			
			JLabel lblNewLabel = new JLabel("Justi\u00E7a Eleitoral");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel.setBounds(248, 22, 194, 31);
			getContentPane().add(lblNewLabel);
			
			JLabel label = new JLabel("");
			label.setBackground(Color.LIGHT_GRAY);
			label.setIcon(new ImageIcon("C:\\Users\\noturno\\Downloads\\Brasao2.jpg"));
			label.setBounds(190, 11, 52, 53);
			getContentPane().add(label);
			
			
		}
	}


