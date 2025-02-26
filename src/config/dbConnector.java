/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class dbConnector {
    
    private Connection connect;
   
   public dbConnector(){
    try{
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/blottersystem", "root","");        
    }catch(SQLException ex){
        System.out.println("Can't conect to database: "+ex.getMessage());
    }   
}
   public ResultSet getData(String sql)throws SQLException{
       Statement stmt = connect.createStatement();
       ResultSet rst = stmt.executeQuery(sql);
       return rst;
	   
}
}