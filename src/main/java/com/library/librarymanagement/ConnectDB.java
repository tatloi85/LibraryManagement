/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.librarymanagement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tatlo
 */
public class ConnectDB {
   
    public static String sql = "jdbc:sqlite:C:/Users/tatlo/Documents/sqlite/librarymanagement.db";
    public static void selectBook(String query) throws SQLException {
        try(Connection conn = DriverManager.getConnection(sql);){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()){
                System.out.println("BookID : " + rs.getInt(1));
                System.out.println("Title : " + rs.getString(2));
                System.out.println("PublishYear: " + Formatter.formatter(rs.getString(3)));
                System.out.println("Category : " +  rs.getString(4));
                System.out.println("quantity : " + rs.getInt(5));
            }
            
        
        }
    }
}
