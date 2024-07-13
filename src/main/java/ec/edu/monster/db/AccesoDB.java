/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author leito
 */
public class AccesoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/eurekabank?autoReconnect=true&useSSL=false";
    private static final String USER = "pardosv3";
    private static final String PASS = "sandoval21";

    public AccesoDB() {
    }
    
    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        try {
            //datos MYSQL
            String driver = "com.mysql.cj.jdbc.Driver";
            //Cargar el driver a memoria
            Class.forName(driver).newInstance();
            //Obtener el objeto Connection
            cn=DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e){
            throw new SQLException("ERROR, no se encuentra el dirver");
        } catch (Exception e){
            throw new SQLException("ERROR, no se tiene acceso el servidor");
        }
        return cn;
    }
} 
