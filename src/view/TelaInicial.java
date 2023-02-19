package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TelaInicial extends JFrame{
	
	public TelaInicial() {
		super("Javacine");
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setForeground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 484, 361);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBorder(UIManager.getBorder("InternalFrame.border"));
		panelMenor.setBackground(new Color(217, 13, 53));
		panelMenor.setBounds(30, 28, 419, 305);
		panel.add(panelMenor);
		panelMenor.setLayout(null);
		
		JLabel titulo = new JLabel("CINEJAVA");
		titulo.setForeground(new Color(253, 199, 36));
		titulo.setBackground(new Color(255, 255, 255));
		titulo.setFont(new Font("Constantia", Font.BOLD, 61));
		titulo.setBounds(68, 127, 326, 153);
		panelMenor.add(titulo);
		
		JButton btnCadastrar = new JButton("Cadastro");
		btnCadastrar.setBackground(new Color(253, 199, 36));
		btnCadastrar.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrar.setBounds(92, 251, 255, 23);
		panelMenor.add(btnCadastrar);
		btnCadastrar.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new TelaCadastro();
					dispose();
				}
			}
		);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Testeee.class.getResource("/view/clapperboard (2).png")));
		lblNewLabel.setBounds(142, 11, 138, 132);
		panelMenor.add(lblNewLabel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaInicial();
	}
}
