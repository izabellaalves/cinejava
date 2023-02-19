package model;

import java.util.ArrayList;

public class Filme {

	private String nome;
	private String duracao;
	private String dataLancamento;
	private String genero;
	private int classificacao;
	private ArrayList<Colaborador> colaboradores;
	
	public Filme (String nome, String duracao, String data, String genero, int classificacao) {
		this.nome = nome;
		this.duracao = duracao;
		dataLancamento = data;
		this.genero = genero;
		this.classificacao = classificacao;
		colaboradores = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public ArrayList<Colaborador> getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(ArrayList<Colaborador> colaboradores) {
		this.colaboradores = colaboradores;
	}
	
	public void cadastrarColaborador(Colaborador colaborador) {
		colaboradores.add(colaborador);
	}
	
	public void excluirColaborador(Colaborador colaborador) {
		colaboradores.remove(colaborador);
	}
}
