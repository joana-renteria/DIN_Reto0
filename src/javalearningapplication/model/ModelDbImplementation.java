package javalearningapplication.model;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * 
 * Implementation for the model when reading data from database
 */

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

    /**
     * Opens connection with database
     */
    private void openConnection() {
        con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Closes connection with database
     */
    private void closeConnection() {
        try {
            if (stmt != null) 
            stmt.close();
        
            if (con != null)
                con.close();
        } catch (SQLException sqle) {
			
		}
    }

    /*
    Gets greeting message from the database
    */
	@Override
	public String getGreeting() {
		try {
		    openConnection();
            stmt = con.prepareStatement(getMessageStatement);
            rs = stmt.executeQuery();
            rs.next();
            greeting = rs.getString("message");
		} catch (SQLException e) {
            e.printStackTrace();
		}
		closeConnection();
		return greeting;
	}

}

