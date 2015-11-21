package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
		
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(1);
				
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Usuario excluido com sucesso!");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Zãozão");
		usu.setLogin("zao");
		usu.setSenha("234");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Usuario alterado com sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		usu.setNome("Tiago");
		usu.setLogin("ti");
		usu.setSenha("324");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}

}
