package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Collegamento {

	private final String HOST = "jdbc:mysql://localhost:3306/jaita93";
	private final String USER = "app_java";
	private final String PASS = "java_2023!";
	
	private Connection connessione;  //proprietà di Collegamento
	
	public Connection getConnessione() {
		if(this.connessione == null) // se c'è una sola istruzione, posso anche non mettere le graffe. Inoltre posso mettere anche un else
			connetti();
		
		return this.connessione;
	}
	
	private void connetti() {
		try {
			this.connessione = DriverManager.getConnection(HOST, USER, PASS); //classe di java che mi serve per connettermi al db
			System.out.println("Connesso.");
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Errore di connessione al DB " + e.getMessage());
		}  
	}

}
