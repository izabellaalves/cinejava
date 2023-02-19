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
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import controllers.ControllerFilme;

public class TelaCadastroFilme extends JFrame{
	
	private JTextField inputNome;
	private JTextField inputDuracao;
	private JTextField inputDataLancamento;
	private JTextField inputGenero;
	private JTextField inputClassificacao;
	ControllerFilme controller = new ControllerFilme();
	
	public TelaCadastroFilme() {
		super("Cadastro de filme");
		
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
		
		JButton btnCadastrarFilme = new JButton("Cadastrar filme");
		btnCadastrarFilme.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrarFilme.setBackground(new Color(253, 199, 36));
		btnCadastrarFilme.setBounds(92, 271, 255, 23);
		btnCadastrarFilme.addActionListener(
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					controller.cadastrarFilme(inputNome.getText(),inputDuracao.getText() , inputDataLancamento.getText(), 
					inputGenero.getText(), Integer.valueOf(inputClassificacao.getText()));
					JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
					new TelaMenu();
					dispose();
					
				}
				
			}
		);
		panelMenor.add(btnCadastrarFilme);
		
		JLabel lblCadastrarFilme = new JLabel("CADASTRAR FILME");
		lblCadastrarFilme.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCadastrarFilme.setForeground(new Color(251, 194, 2));
		lblCadastrarFilme.setFont(new Font("Constantia", Font.BOLD, 25));
		lblCadastrarFilme.setBounds(58, 11, 289, 46);
		panelMenor.add(lblCadastrarFilme);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(24, 68, 46, 14);
		panelMenor.add(lblNome);
		
		JLabel lblDuracao = new JLabel("Duração");
		lblDuracao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDuracao.setForeground(Color.WHITE);
		lblDuracao.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblDuracao.setBounds(35, 107, 67, 14);
		panelMenor.add(lblDuracao);
		
		JLabel lblDataDeLancamento = new JLabel("Data de lançamento");
		lblDataDeLancamento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDataDeLancamento.setForeground(Color.WHITE);
		lblDataDeLancamento.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblDataDeLancamento.setBounds(33, 144, 171, 14);
		panelMenor.add(lblDataDeLancamento);
		
		JLabel lblGenero = new JLabel("Gênero");
		lblGenero.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblGenero.setBounds(24, 182, 67, 14);
		panelMenor.add(lblGenero);
		
		JLabel lblClassificacao = new JLabel("Classificação");
		lblClassificacao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClassificacao.setForeground(Color.WHITE);
		lblClassificacao.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblClassificacao.setBounds(35, 219, 124, 14);
		panelMenor.add(lblClassificacao);
		
		inputNome = new JTextField();
		inputNome.setBounds(87, 68, 289, 20);
		panelMenor.add(inputNome);
		inputNome.setColumns(10);
		
		inputDuracao = new JTextField();
		inputDuracao.setColumns(10);
		inputDuracao.setBounds(112, 107, 264, 20);
		panelMenor.add(inputDuracao);
		
		inputDataLancamento = new JTextField();
		inputDataLancamento.setColumns(10);
		inputDataLancamento.setBounds(217, 144, 160, 20);
		panelMenor.add(inputDataLancamento);
		
		inputGenero = new JTextField();
		inputGenero.setColumns(10);
		inputGenero.setBounds(107, 182, 269, 20);
		panelMenor.add(inputGenero);
		
		inputClassificacao = new JTextField();
		inputClassificacao.setColumns(10);
		inputClassificacao.setBounds(180, 219, 196, 20);
		panelMenor.add(inputClassificacao);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBackground(new Color(192, 192, 192));
		btnVoltar.setBounds(0, 0, 48, 23);
		panel.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaMenu();
				dispose();
			}
		});
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaCadastroFilme();

	}

}
