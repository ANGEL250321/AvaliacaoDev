package br.com.exame.factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {

	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "angel1996";
	
	//caminho banco de dados
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306";
	
	
	//conexão com o banco de dados 
	
	public static Connection createConnectiononToMySQL() throws Exception{
		
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			
			return connection;
	}
	public static void main(String[] args)throws Exception {
		
		Connection con = createConnectiononToMySQL();
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
	}
}


	