/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba3.controller;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
/**
 *
 * @author tomac
 */
public class ConectorBD {
    
   private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
   
   public void crearConexion() throws SQLException {
       
       final String DB_URL = "jdbc:oracle:thin:@peliculas_high?TNS_ADMIN=./Wallet_Peliculas";
       
       final String DB_USER = "admin";
       String DB_PASSWORD = "La1s2d3f412.";
       final String CONN_FACTORY_CLASS_NAME = "oracle.jdbc.pool.OracleDataSource";
       
       PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();
       
       pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
       pds.setURL(DB_URL);
       pds.setUser(DB_USER);
       pds.setPassword(DB_PASSWORD);
       pds.setConnectionPoolName("JDBC_UCP_POOL");
       
       pds.setInitialPoolSize(5);
       pds.setMinPoolSize(5);
       pds.setMaxPoolSize(20);
       
       try{
           this.conn = pds.getConnection();
         
       }
       catch(Exception e){
           e.printStackTrace();
       }
       System.out.println("Available connections after checkout: "
                + pds.getAvailableConnectionsCount());
        System.out.println("Borrowed connections after checkout: "
                + pds.getBorrowedConnectionsCount());
        // Perform a database operation

        System.out.println("CONEXION EXITOSA");
        System.out.println("CONECTADO al schema: " + conn.getSchema());
       
   }
    
}
