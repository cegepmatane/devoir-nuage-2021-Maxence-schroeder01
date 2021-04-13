package donnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDonnees {
	private Connection connection = null;
	
	private BaseDeDonnees()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bergerie", "nadine", "testtest");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// SINGLETON - DEBUT
	private static BaseDeDonnees instance = null;
	public static BaseDeDonnees getInstance()
	{
		if(null == instance) instance = new BaseDeDonnees();
		return instance;
	}
	// SINGLETON - FIN

	public Connection getConnection()
	{
		return this.connection;
	}
	
}
