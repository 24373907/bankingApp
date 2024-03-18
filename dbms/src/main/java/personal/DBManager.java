package personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class DBManager {

    private HashMap<String, Integer> accounts;


    private static Connection establishConnection() {

        try {
           
            String DBurl = "jdbc:sqlite:DataBase\\BankingAppDB.db";
            Connection connection = DriverManager.getConnection(DBurl);
            return connection;

        } catch (SQLException e) { 
            System.out.println(e.getMessage());

            return null;
        } 

        
    }

    
}
