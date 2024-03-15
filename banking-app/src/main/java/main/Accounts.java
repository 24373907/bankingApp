package main;

import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.SQLException;  


public class Accounts {
    
    private HashMap<String, Integer> accounts;


    private static boolean establishConnection() {

        try {
           
            String DBurl = "jdbc:sqlite:DataBase\\BankingAppDB.db";
            Connection connection = DriverManager.getConnection(DBurl);
            

        } catch (SQLException e) { 
            System.out.println(e.getMessage());
            return false;
        } 

        return true;
    }

   
}
