package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public static Connection Connector(){
		try{
			Connection connection = DriverManager.getConnection("jdbc:sqlite:Users\\Nada-\\Des ktop\\TutorielFXDB.sqlite");
			return connection;
			}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
