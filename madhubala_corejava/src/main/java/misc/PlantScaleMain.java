package misc;

import java.sql.Connection;
import day11.solved.ConnectionUtil;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PlantScaleMain {
public static void main(String[] args) throws SQLException {
	
	String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java";
	 		
    String userName = "273z1j23ezmyz3yglqia";
     
    String password = "pscale_pw_dfN5v4Y7cXHWgSEZ6HxdkF7I0wmnkdNJ3wvLamlAros";

	Connection con = DriverManager.getConnection(url, userName, password);

	System.out.println("connection created...");
	
    con.close();

}

}