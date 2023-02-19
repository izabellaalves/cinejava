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
import controllers.ControllerUsuario;

public class TelaDadosFilme extends JFrame{
	
	private JTextField inputNome;
	private JTextField inputDuracao;
	private JTextField inputDataLancamento;
	private JTextField inputGenero;
	private JTextField inputClassificacao;
	ControllerUsuario controller = new ControllerUsuario();
	ControllerFilme controllerFilme = new ControllerFilme();
	
	public TelaDadosFilme(int posFilme) {
		super("Dados do filme selecionado");
		
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
		
		JButton btnCadastrarColaborador = new JButton("Cadastrar colaborador");
		btnCadastrarColaborador.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnCadastrarColaborador.setBackground(new Color(253, 199, 36));
		btnCadastrarColaborador.setBounds(90, 236, 255, 23);
		panelMenor.add(btnCadastrarColaborador);
		btnCadastrarColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaCadastroColaborador(posFilme);
				dispose();
			}
		}
		);
		
		JLabel lblDadosFilme = new JLabel("DADOS DO FILME");
		lblDadosFilme.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDadosFilme.setForeground(new Color(251, 194, 2));
		lblDadosFilme.setFont(new Font("Constantia", Font.BOLD, 25));
		lblDadosFilme.setBounds(35, 11, 289, 46);
		panelMenor.add(lblDadosFilme);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(23, 54, 46, 14);
		panelMenor.add(lblNome);
		
		JLabel lblDuracao = new JLabel("Duração");
		lblDuracao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDuracao.setForeground(Color.WHITE);
		lblDuracao.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblDuracao.setBounds(34, 93, 67, 14);
		panelMenor.add(lblDuracao);
		
		JLabel lblDataDeLancamento = new JLabel("Data de lançamento");
		lblDataDeLancamento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDataDeLancamento.setForeground(Color.WHITE);
		lblDataDeLancamento.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblDataDeLancamento.setBounds(32, 130, 171, 14);
		panelMenor.add(lblDataDeLancamento);
		
		JLabel lblGenero = new JLabel("Gênero");
		lblGenero.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblGenero.setBounds(23, 168, 67, 14);
		panelMenor.add(lblGenero);
		
		JLabel lblClassificacao = new JLabel("Classificação");
		lblClassificacao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClassificacao.setForeground(Color.WHITE);
		lblClassificacao.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblClassificacao.setBounds(34, 205, 124, 14);
		panelMenor.add(lblClassificacao);
		
		inputNome = new JTextField(controller.usuario.getFilmesFavoritos().get(posFilme).getNome());
		inputNome.setBounds(86, 54, 289, 20);
		panelMenor.add(inputNome);
		inputNome.setColumns(10);
		
		inputDuracao = new JTextField(controller.usuario.getFilmesFavoritos().get(posFilme).getDuracao());
		inputDuracao.setColumns(10);
		inputDuracao.setBounds(111, 93, 264, 20);
		panelMenor.add(inputDuracao);
		
		inputDataLancamento = new JTextField(controller.usuario.getFilmesFavoritos().get(posFilme).getDataLancamento());
		inputDataLancamento.setColumns(10);
		inputDataLancamento.setBounds(216, 130, 160, 20);
		panelMenor.add(inputDataLancamento);
		
		inputGenero = new JTextField(controller.usuario.getFilmesFavoritos().get(posFilme).getGenero());
		inputGenero.setColumns(10);
		inputGenero.setBounds(106, 168, 269, 20);
		panelMenor.add(inputGenero);
		
		inputClassificacao = new JTextField(String.valueOf(controller.usuario.getFilmesFavoritos().get(posFilme).getClassificacao()));
		inputClassificacao.setColumns(10);
		inputClassificacao.setBounds(179, 205, 196, 20);
		panelMenor.add(inputClassificacao);
		
		JButton btnColaboradores = new JButton("Colaboradores");
		btnColaboradores.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnColaboradores.setBackground(new Color(253, 199, 36));
		btnColaboradores.setBounds(26, 270, 142, 23);
		panelMenor.add(btnColaboradores);
		btnColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaListaColaboradores(posFilme);
				dispose();
				
			}
		}
		);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnEditar.setBackground(new Color(253, 199, 36));
		btnEditar.setBounds(190, 270, 93, 23);
		panelMenor.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = inputNome.getText();
				String duracao = inputDuracao.getText();
				String data = inputDataLancamento.getText();
				String genero = inputGenero.getText();
				int classificacao = Integer.valueOf(inputClassificacao.getText());
				
				controllerFilme.editarFilme(posFilme, nome, duracao, data, genero, classificacao);
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				new TelaDadosFilme(posFilme);
				dispose();
			}
		}
		);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnExcluir.setBackground(new Color(253, 199, 36));
		btnExcluir.setBounds(305, 270, 93, 23);
		panelMenor.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controllerFilme.excluirFilme(controller.usuario.getFilmesFavoritos().get(posFilme));
				JOptionPane.showMessageDialog(null, "Filme excluído com sucesso!");
				new TelaListaFilmes();
				dispose();
			}
		}
		);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBackground(new Color(192, 192, 192));
		btnVoltar.setBounds(0, 0, 48, 23);
		panel.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaListaFilmes();
				dispose();
			}
		});
		
		
		setVisible(true);
	}

}
