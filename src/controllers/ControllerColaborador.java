package controllers;

import javax.swing.DefaultListModel;

import model.Colaborador;
import view.TelaDadosColaborador;
import view.TelaDadosFilme;

public class ControllerColaborador {
	
	ControllerUsuario controllerUsuario = new ControllerUsuario();
	ControllerFilme controllerFilme = new ControllerFilme();
	
	public void cadastrarColaborador(int posFilme, String nome, String pais, String dataNascimento, String funcao) {
		Colaborador colaborador = new Colaborador(nome, pais, dataNascimento, funcao);
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).cadastrarColaborador(colaborador);
		System.out.println(controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores());
	}
	
	public DefaultListModel<String> listarColaboradores(int posFilme) {
		DefaultListModel<String> names = new DefaultListModel<>();
		int size = controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().size();
		
		for(int i = 0; i < size ; i++) {
			String name = controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(i).getNome();
			names.addElement(name);
		}
		return names;
	}

	public void mostrarDadosColaborador(int posFilme, String string) {
		for (int i = 0; i < controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().size(); i++) {
			if (controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(i).getNome().equals(string)) {
				new TelaDadosColaborador(posFilme, i);
			}
		
		}
	}
	
	public void editarColaborador(int posFilme, int posColaborador, String nome, String pais, String dataNascimento, String funcao) {
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).setNome(nome);
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).setPais(pais);
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).setDataNascimento(dataNascimento);
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).getColaboradores().get(posColaborador).setFuncao(funcao);
	}
	
	
	public void excluirColaborador(int posFilme, Colaborador colaborador) {
		controllerUsuario.usuario.getFilmesFavoritos().get(posFilme).excluirColaborador(colaborador);
	}
	

}
