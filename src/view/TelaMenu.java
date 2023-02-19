package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TelaMenu extends JFrame{
	
	public TelaMenu(){
		super("Menu");
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
		panelMenor.setBounds(32, 28, 419, 305);
		panel.add(panelMenor);
		panelMenor.setLayout(null);
		
		JButton btnCadastrar = new JButton("Ver seus filmes favoritos");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaListaFilmes();
				dispose();
			}
		});
		btnCadastrar.setBackground(new Color(253, 199, 36));
		btnCadastrar.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrar.setBounds(72, 180, 275, 38);
		panelMenor.add(btnCadastrar);
		
		JButton btnCadastrarFilme = new JButton("Cadastrar filme");
		btnCadastrarFilme.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrarFilme.setBackground(new Color(253, 199, 36));
		btnCadastrarFilme.setBounds(72, 131, 275, 38);
		panelMenor.add(btnCadastrarFilme);
		btnCadastrarFilme.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new TelaCadastroFilme();
						dispose();
					}
				}
			);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(new Color(251, 194, 2));
		lblMenu.setFont(new Font("Constantia", Font.BOLD, 37));
		lblMenu.setBounds(162, 45, 126, 46);
		panelMenor.add(lblMenu);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaMenu();

	}

}
