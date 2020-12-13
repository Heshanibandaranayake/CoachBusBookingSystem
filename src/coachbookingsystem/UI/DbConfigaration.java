/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachbookingsystem.UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class DbConfigaration {
    public static Connection establishConnection() throws ClassNotFoundException, SQLException {


        Connection connection = null;


        try {


            Class.forName("com.mysql.jdbc.Driver");


            String jdbcURL = "jdbc:mysql://localhost:3306/coachbookingsystem";


            connection = (Connection) DriverManager.getConnection(jdbcURL, "root", "");




        } catch (SQLException exception) {


            exception.printStackTrace();


        }


        return connection;




    }



    
}
