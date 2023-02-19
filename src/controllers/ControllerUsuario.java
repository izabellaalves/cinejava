package controllers;

import model.Usuario;

public class ControllerUsuario {
	
	public static Usuario usuario;
	
		public void cadastrarUsuario(String nome, String email) {
			usuario = new Usuario(nome, email);
		}
	
}
