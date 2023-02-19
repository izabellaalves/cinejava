package model;

public class Colaborador {
	
		private String nome;
		private String pais;
		private String dataNascimento;
		private String funcao;

		public Colaborador(String nome, String pais, String dataNascimento, String funcao) {
			this.nome = nome;
			this.pais = pais;
			this.dataNascimento = dataNascimento;
			this.funcao = funcao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getFuncao() {
			return funcao;
		}

		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		
		
	
}
