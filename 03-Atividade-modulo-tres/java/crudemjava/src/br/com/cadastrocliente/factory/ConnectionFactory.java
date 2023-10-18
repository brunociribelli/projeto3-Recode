package br.com.cadastrocliente.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// Nome do usuário do MySQL
		private static final String USERNAME = "root";  
		
		// Senha do MySQL
		private static final String PASSWORD = "3306";

		//Dados do caminho, porta e nome da base de dados que irá ser feita a conexão
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/cadastro_cliente";

		/*
		 * Cria uma conexão com o banco de dados MySQL utilizando o nome do usuário e senha fornecidos
		 * @param username
		 * @param senha
		 * @return uma conexão com o banco de dados
		 * @throws Exception
		 */
		  public static Connection createConnectionToMySQL() throws Exception {
			  //Faz com que a classe seja carregada pela JVM
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  //Cria a conexão com oo banco de dados
			  Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			  
			  return connection;
		  }

		  
	public static void main(String[] args) throws Exception {
		
		//Recupera uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testa se a conexão é nula
		if(con!=null) {
			System.out.println("Conexão obetida com sucesso!");
			con.close();
		}
	}
	

}
