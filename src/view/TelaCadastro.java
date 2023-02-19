package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import controllers.ControllerUsuario;

public class TelaCadastro extends JFrame{
	
	private JTextField inputNome;
	private JTextField inputEmail;
	private JLabel lblNewLabel = new JLabel("REALIZE SEU CADASTRO");
	ControllerUsuario controller = new ControllerUsuario();

	public TelaCadastro() {
		super("Cadastro");
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
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cadastrarUsuario(inputNome.getText(), inputEmail.getText());
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				new TelaMenu();
				dispose();
			}
		});
		btnCadastrar.setBackground(new Color(253, 199, 36));
		btnCadastrar.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrar.setBounds(169, 258, 106, 23);
		panelMenor.add(btnCadastrar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(29, 91, 54, 23);
		panelMenor.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblEmail.setBounds(29, 141, 77, 23);
		panelMenor.add(lblEmail);
		
		
		inputNome = new JTextField();
		inputNome.setBounds(102, 95, 278, 20);
		panelMenor.add(inputNome);
		inputNome.setColumns(10);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(102, 145, 278, 20);
		panelMenor.add(inputEmail);
		
		lblNewLabel.setForeground(new Color(255, 181, 26));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 24));
		lblNewLabel.setBounds(73, 32, 318, 48);
		panelMenor.add(lblNewLabel);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TelaCadastro();

	}

}
