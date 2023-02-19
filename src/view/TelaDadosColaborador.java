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

import controllers.ControllerColaborador;
import controllers.ControllerUsuario;

public class TelaDadosColaborador extends JFrame{
	
	private JTextField inputNome;
	private JTextField inputPais;
	private JTextField inputDataNascimento;
	private JTextField inputFuncao;
	ControllerColaborador controllerColaborador = new ControllerColaborador();
	ControllerUsuario controllerUsuario = new ControllerUsuario();
	
	public TelaDadosColaborador(int posFilme, int posColaborador) {
		super("Dados do colaborador selecionado");
		
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
		
		JLabel lblDadosFilme = new JLabel("DADOS DO COLABORADOR");
		lblDadosFilme.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDadosFilme.setForeground(new Color(251, 194, 2));
		lblDadosFilme.setFont(new Font("Constantia", Font.BOLD, 25));
		lblDadosFilme.setBounds(-17, 26, 395, 46);
		panelMenor.add(lblDadosFilme);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(22, 101, 46, 14);
		panelMenor.add(lblNome);
		
		JLabel lblPais = new JLabel("País");
		lblPais.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPais.setForeground(Color.WHITE);
		lblPais.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblPais.setBounds(0, 140, 67, 14);
		panelMenor.add(lblPais);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDataDeNascimento.setForeground(Color.WHITE);
		lblDataDeNascimento.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblDataDeNascimento.setBounds(31, 177, 171, 14);
		panelMenor.add(lblDataDeNascimento);
		
		inputNome = new JTextField(controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).getNome());
		inputNome.setBounds(85, 101, 289, 20);
		panelMenor.add(inputNome);
		inputNome.setColumns(10);
		
		inputPais = new JTextField(controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).getPais());
		inputPais.setColumns(10);
		inputPais.setBounds(85, 140, 289, 20);
		panelMenor.add(inputPais);
		
		inputDataNascimento = new JTextField(controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).getDataNascimento());
		inputDataNascimento.setColumns(10);
		inputDataNascimento.setBounds(215, 177, 160, 20);
		panelMenor.add(inputDataNascimento);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnEditar.setBackground(new Color(253, 199, 36));
		btnEditar.setBounds(61, 270, 130, 23);
		panelMenor.add(btnEditar);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = inputNome.getText();
				String pais = inputPais.getText();
				String data = inputDataNascimento.getText();
				String funcao = inputFuncao.getText();
				
				controllerColaborador.editarColaborador(posFilme, posColaborador, nome, pais, data, funcao);
				JOptionPane.showMessageDialog(null, "Filme editado com sucesso!");
				new TelaDadosColaborador(posFilme, posColaborador);
				dispose();
			}
		}
		);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnExcluir.setBackground(new Color(253, 199, 36));
		btnExcluir.setBounds(216, 270, 130, 23);
		panelMenor.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controllerColaborador.excluirColaborador(posFilme, controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador));
				JOptionPane.showMessageDialog(null, "Colaborador excluído com sucesso!");
				new TelaListaColaboradores(posFilme);
				dispose();
			}
		}
		);
		
		JLabel lblFuncao = new JLabel("Função");
		lblFuncao.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFuncao.setForeground(Color.WHITE);
		lblFuncao.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblFuncao.setBounds(22, 213, 67, 14);
		panelMenor.add(lblFuncao);
		
		inputFuncao = new JTextField(controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).getFuncao());
		inputFuncao.setColumns(10);
		inputFuncao.setBounds(99, 213, 275, 20);
		panelMenor.add(inputFuncao);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBackground(new Color(192, 192, 192));
		btnVoltar.setBounds(0, 0, 48, 23);
		panel.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaListaColaboradores(posFilme);
				dispose();
			}
		});
		
		setVisible(true);
		
	}

}
