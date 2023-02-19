package controllers;

import javax.swing.DefaultListModel;

import model.Filme;
import view.DadosCachorroTela;
import view.DadosCoelhoTela;
import view.DadosGatoTela;
import view.TelaDadosFilme;

public class ControllerFilme {
	
	ControllerUsuario controllerUsuario = new ControllerUsuario();
	
	public void cadastrarFilme(String nome, String duracao, String data, String genero, int classificacao) {
		Filme filme = new Filme(nome, duracao, data, genero, classificacao);
		controllerUsuario.usuario.cadastrarFilme(filme);
		System.out.println(controllerUsuario.usuario.getFilmesFavoritos());
	}
		
	public DefaultListModel<String> listarFilmes() {
		DefaultListModel<String> names = new DefaultListModel<>();
		int size = controllerUsuario.usuario.getFilmesFavoritos().size();
		
		for(int i = 0; i < size ; i++) {
			String name = controllerUsuario.usuario.getFilmesFavoritos().get(i).getNome();
			names.addElement(name);
		}
		return names;
	}
	
	public void mostrarDadosFilme(String nome) {
		for (int i = 0; i < controllerUsuario.usuario.getFilmesFavoritos().size(); i++) {
			if (controllerUsuario.usuario.getFilmesFavoritos().get(i).getNome().equals(nome)) {
				new TelaDadosFilme(i);
			}
		
		}
	}
	
	public void editarFilme(int i,String nome, String duracao, String data, String genero, int classificacao) {
		controllerUsuario.usuario.getFilmesFavoritos().get(i).setNome(nome);
		controllerUsuario.usuario.getFilmesFavoritos().get(i).setDuracao(duracao);
		controllerUsuario.usuario.getFilmesFavoritos().get(i).setDataLancamento(data);
		controllerUsuario.usuario.getFilmesFavoritos().get(i).setGenero(genero);
		controllerUsuario.usuario.getFilmesFavoritos().get(i).setClassificacao(classificacao);
	}
	
	public void excluirFilme(Filme filme) {
		controllerUsuario.usuario.excluirFilme(filme);
	}

	public void buscarFilme(String nome) {
		for (int i = 0; i < controllerUsuario.usuario.getFilmesFavoritos().size(); i++) {
			if (controllerUsuario.usuario.getFilmesFavoritos().get(i).getNome().equals(nome) ) {
				new TelaDadosFilme(i);
				break;
			}
		}
	}
}
