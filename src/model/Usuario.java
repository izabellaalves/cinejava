package model;

import java.util.ArrayList;

import view.TelaDadosFilme;

public class Usuario {

	private String nome;
	private String email;
	private ArrayList<Filme> filmesFavoritos;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		filmesFavoritos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Filme> getFilmesFavoritos() {
		return filmesFavoritos;
	}

	public void setFilmesFavoritos(ArrayList<Filme> filmesFavoritos) {
		this.filmesFavoritos = filmesFavoritos;
	}
	
	// outros metodos
	
	public void cadastrarFilme(Filme filme) {
		filmesFavoritos.add(filme);
	}
	
	public void excluirFilme(Filme filme) {
		filmesFavoritos.remove(filme);
	}
	
	
}
