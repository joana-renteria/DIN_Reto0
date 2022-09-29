package javalearningapplication.model;

import java.sql.*;
import java.util.ResourceBundle;

public class ModelDbImplementation implements Model{
	private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
	
	private String greeting = null;
	
    private ResourceBundle configFile = 
        ResourceBundle.getBundle("resources.dbconnection");
    private String 
        url = configFile.getString("Conn"),
        user = configFile.getString("DBUser"),
        pass = configFile.getString("DBPass");
		
	private String getMessageStatement = 
		"SELECT * FROM messages LIMIT 1";

    private void openConnection() {
        con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {

        }
    }

    private void closeConnection() {
        try {
            if (stmt != null) 
            stmt.close();
        
            if (con != null)
                con.close();
        } catch (SQLException sqle) {
			
		}
    }

	@Override
	public String getGreeting() {
		try {
		    openConnection();
            stmt = con.prepareStatement(getMessageStatement);
            rs = stmt.executeQuery();
            rs.next();
            greeting = rs.getCharacterStream("message").toString();
		} catch (SQLException e) {
			closeConnection();
		}
		closeConnection();
		return greeting;
	}

}
