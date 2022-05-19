/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author blemb
 */
public class MyConnect {
    String user= "root";
    String password = "";
    String host = "localhost";
    String database = "lienhe";
    String url= "jdbc:mysql://" + host + ":3306/" + database;
    Connection connect = null;
    Statement st = null;
    ResultSet rs = null;
    
    MyConnect(){}
    public MyConnect(String host, String user, String password, String DataBase){
        this.host = host;
        this.password = password;
        this.user = user;
        this.database = DataBase;
    }
    public Connection open() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connect Succesful");
            this.connect = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.connect;
    }
    
    public void close() throws IOException, SQLException{
        this.connect.close();
    }
    
}
