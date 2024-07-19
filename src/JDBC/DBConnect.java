/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.*;
import java.sql.Connection;
/**
 *
 * @author This Pc
 */
public class DBConnect {
    
    public static Connection connect = null;
    public static Connection getConnection(){            
        String strDbUrl = "jdbc:sqlserver://localhost:1433; "
                + "databaseName=QLBA;"     
                + "user=sa;"
                + "password=12345;"
                + "encrypt=true;trustServerCertificate=true";  
        
        try {
                connect = DriverManager.getConnection(strDbUrl);
                System.out.println("OK");
             
            } 
         catch (Exception e) {
                System.out.println("Khong the ket noi den CSDL \n" + e);
            }
        return connect;

    }
    public static void main(String[] args) {
        System.out.println("ĐĂNG NHẬP THÀNH CÔNG");
    }
}
