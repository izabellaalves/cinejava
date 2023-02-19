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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.ControllerColaborador;
import controllers.ControllerUsuario;

public class TelaListaColaboradores extends JFrame implements ListSelectionListener{
	
	JList list = new JList();
	ControllerColaborador controllerColaborador = new ControllerColaborador();
	
	public TelaListaColaboradores(int posFilme) {
		super("Lista de colaboradores");
		
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
		
		JLabel lblTitulo = new JLabel("COLABORADORES DO FILME");
		lblTitulo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitulo.setForeground(new Color(251, 194, 2));
		lblTitulo.setFont(new Font("Constantia", Font.BOLD, 25));
		lblTitulo.setBounds(0, 28, 395, 46);
		panelMenor.add(lblTitulo);
		
		JPanel panelLista = new JPanel();
		panelLista.setBounds(30, 85, 367, 200);
		panelLista.setLayout(new BorderLayout());
		panelMenor.add(panelLista);
		
		
		list.setModel(controllerColaborador.listarColaboradores(posFilme));
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelLista.add(scrollPane1, BorderLayout.CENTER);
		list.addListSelectionListener(new ListSelectionListener () {
			public void valueChanged(ListSelectionEvent e) {
				Object src = e.getSource();
				
				if(e.getValueIsAdjusting() && src == list) {
					controllerColaborador.mostrarDadosColaborador(posFilme, list.getSelectedValue().toString());
					dispose();
				}
				
			}
		}
		);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBackground(new Color(192, 192, 192));
		btnVoltar.setBounds(0, 0, 48, 23);
		panel.add(btnVoltar);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaDadosFilme(posFilme);
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	

}
