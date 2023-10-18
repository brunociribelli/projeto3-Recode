package br.com.cadastrocliente.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastrocliente.factory.ConnectionFactory;


public class usuarioDAO {

	
	public void save(usuarioDAO) {
		
		String sql = "INSERT INTO usuario(nome, telefone, email) VALUES (?, ?, ?)";
	
        Connection conn = null;
		PreparedStatement pstm = null;		
	
	try {
		//Criar uma conexão com o banco de dados
	    conn = ConnectionFactory.createConnectionToMySQL();
	
	    //Criamos uma PreparedStatement, para executar uma query
	    pstm = (PreparedStatement) conn.prepareStatement(sql);
	    //Adicionar os valores que são esperados pela query
	    pstm.setString((1, usuario.getNome());
	    pstm.setString (2, usuario.getTelefone());
	    pstm.setString(3, usuario.getEmail());
	
	    //Executar a query
	    pstm.execute();
	}catch (Exception e) {
		 e.printStackTrace();
	}finally {
	      
		//Fechar as conexões
		try {
			if(pstm!=null) {
				pstm.close();
			}
			
			if(conn!=null) {
				conn.close();
		   }
		}catch (Exception e) {
			e.printStackTrace();
	}
  }
		
 }
	
}
	
}	
	
	
	
	   
	
	
	
  
	
