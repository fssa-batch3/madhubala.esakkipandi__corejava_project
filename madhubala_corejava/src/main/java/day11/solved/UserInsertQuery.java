package day11.solved;

import java.sql.Connection;

import com.mysql.cj.xdevapi.Statement;

/**
 * @author BharathwajSoundarara
 *
 */

public class UserInsertQuery {
 
    public static void main(String[] args) throws Exception {       
         
        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = (Statement) connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query ="INSERT INTO USERS (user_name, email_id, additional_info, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\",\"Instructor FSSA\", \"password007\")";
        int rows = ((java.sql.Statement) stmt).executeUpdate(query);
        System.out.println("No of rows inserted :" + rows );
         
         
        //Step 04: close the connection resources       
       
        ((Connection) stmt).close();
        connection.close();
         
         
         
    }
     
}