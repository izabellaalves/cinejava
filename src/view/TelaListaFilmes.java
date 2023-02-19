package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.ControllerFilme;

public class TelaListaFilmes extends JFrame implements ListSelectionListener{
	
	private JTextField inputNomeFilme;
	ControllerFilme controller = new ControllerFilme();
	JList list = new JList();
	
	public TelaListaFilmes() {
		super("Lista de filmes");
		
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
		
		JLabel lblTitulo = new JLabel("SEUS FILMES FAVORITOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitulo.setForeground(new Color(251, 194, 2));
		lblTitulo.setFont(new Font("Constantia", Font.BOLD, 25));
		lblTitulo.setBounds(-21, 28, 395, 46);
		panelMenor.add(lblTitulo);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(new Color(255, 255, 255));
		lblBuscar.setFont(new Font("MS Gothic", Font.BOLD, 18));
		lblBuscar.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBuscar.setBounds(0, 85, 87, 14);
		panelMenor.add(lblBuscar);
		
		inputNomeFilme = new JTextField();
		inputNomeFilme.setBounds(108, 85, 232, 20);
		panelMenor.add(inputNomeFilme);
		inputNomeFilme.setColumns(10);
		
		JButton btnIr = new JButton("Ir");
		btnIr.setFont(new Font("MS Gothic", Font.BOLD, 14));
		btnIr.setBackground(new Color(253, 199, 36));
		btnIr.setBounds(350, 85, 50, 23);
		panelMenor.add(btnIr);
		btnIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.buscarFilme(inputNomeFilme.getText());
			}
		}
		);
		
		JPanel panelLista = new JPanel();
		panelLista.setBounds(30, 131, 367, 150);
		panelLista.setLayout(new BorderLayout());
		panelMenor.add(panelLista);
		
		
		list.setModel(controller.listarFilmes());
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelLista.add(scrollPane1, BorderLayout.CENTER);
		list.addListSelectionListener(this);
		
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
		new TelaListaFilmes();

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == list) {
			controller.mostrarDadosFilme(list.getSelectedValue().toString());
			dispose();
		}
		
	}

}
