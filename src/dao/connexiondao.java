package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class connexiondao {

	public static void main(String[] args){
		Connection conn = connexionbdd();
	}
	private static Connection conn = null;
	
	public static Connection connexionbdd() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver ok");
			String url ="jdbc:mysql://localhost:3306/dossiercharge";
			String user = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("connexion à la bdd réussi");
			return conn;

		}
		
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public static Connection getConn() {
		return conn;
	}
	public static void setConn(Connection conn) {
		connexiondao.conn = conn;
	}
}
