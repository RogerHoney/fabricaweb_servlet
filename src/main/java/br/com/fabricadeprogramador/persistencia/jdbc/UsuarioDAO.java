package br.com.fabricadeprogramador.persistencia.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;


public class UsuarioDAO {

private Connection con = ConexaoFactory.getConnection();
	public void cadastrar(Usuario usu) {
		
		String sql = "insert into usuario (nome, login, senha) values(?, ?, ?)";
		
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void alterar(Usuario usu) {

		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		
		try(PreparedStatement preparador = con.prepareStatement(sql)) {
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			
			preparador.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void excluir(Usuario usu) {
		String sql = "delete from usuario where id=?";
		
		
		try(PreparedStatement preparador = con.prepareStatement(sql)) {
			
			preparador.setInt(1, usu.getId());
			
			preparador.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
