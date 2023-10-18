package br.com.cadastrocliente.aplicacao;

public class Main {
	
	public static void main(String[] args) {
		
		usuarioDAO usuarioDAO = new usuarioDAO
		
		br.com.cadastrocliente.model.cadastrocliente  cadastrocliente = new Cadastrocliente();
		cadastrocliente.setNome("joão");
		cadastrocliente.setTelefone("1198686-8686");
		cadastrocliente.setEmail("joão@gmail.com");
	
		usuarioDAO.save(usuarioDAO);
	}

}