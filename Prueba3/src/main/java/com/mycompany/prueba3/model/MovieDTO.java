/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba3.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tomac
 */
public class MovieDTO {
    
    public boolean agregarPelicula(MovieDAO peliculaNueva, Connection conexion) throws SQLException{
        
        
        String queryStatement = "INSERT INTO ADMIN.MOVIE (TITULO, DIRECTOR, ANHO, DURACION, GENERO) VALUES(?,?,?,?,?)";
        
        System.out.println("\n Query is " + queryStatement);
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        ps.setString(1,peliculaNueva.getTitulo());
        ps.setString(2,peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnho());
        ps.setInt(4,peliculaNueva.getDuracion());
        ps.setString(5,peliculaNueva.getGenero());
        
        int resultado = ps.executeUpdate();
        
        System.out.println("Cantidad insertados"+resultado);
        return true;
}
    
    public boolean modificarPeliculaID(MovieDAO peliculaNueva, Connection conexion) throws SQLException{
        
        String queryStatment = "UPDATE " +conexion.getSchema()+ ".MOVIE SET TITULO=?, DIRECTOR=?, ANHO=?, DURACION=?, GENERO=? WHERE ID=?";
        
        System.out.println("\n Query is " +queryStatment);
        
        PreparedStatement ps = conexion.prepareStatement(queryStatment);
        
        
        ps.setString(1, peliculaNueva.getTitulo());
        ps.setString(2,peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnho());
        ps.setInt(4,peliculaNueva.getDuracion());
        ps.setString(5,peliculaNueva.getGenero());
        ps.setInt(6, peliculaNueva.getId());
        
        int resultado = ps.executeUpdate();
        
        System.out.println("Cantidad modificados:" + resultado);
        return true;
        
    }
    
    public boolean buscarPelicula(MovieDAO peliculaBusqueda, Connection conn)throws SQLException{
    String query = "SELECT ID, TITULO, DIRECTOR, ANHO, DURACION, GENERO FROM "+conn.getSchema()+".MOVIE WHERE TITULO=?";
        
        System.out.println("\n Query is " + query);
        
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setString(1, peliculaBusqueda.getTitulo());
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
            peliculaBusqueda.setId(rs.getInt(1));
            peliculaBusqueda.setDirector(rs.getString(3));
            peliculaBusqueda.setAnho(rs.getInt(4));
            peliculaBusqueda.setDuracion(rs.getInt(5));
            peliculaBusqueda.setGenero(rs.getString(6));
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminarPelicula(MovieDAO pelicula, Connection conn) throws SQLException{
        String query = "DELETE FROM " +conn.getSchema()+ ".MOVIE WHERE ID=?";
        
        System.out.println("\n Query is " +query);
        
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, pelicula.getId());
        
        
        
        int resultado = ps.executeUpdate();
        
        System.out.println("Cantidad modificados:" + resultado);
        return true;
        
    }
    
    public ArrayList<MovieDAO> ListaPelicula(Connection conn) throws SQLException{
        
        String query = "SELECT ID, TITULO, DIRECTOR, ANHO, DURACION, GENERO FROM "+conn.getSchema()+".MOVIE ORDER BY ANHO";
        
        System.out.println("\n Query is " + query);
        
        PreparedStatement ps = conn.prepareStatement(query);
        
        ResultSet rs = ps.executeQuery();
        
        ArrayList<MovieDAO> listaPelicula = new ArrayList<MovieDAO>();
        
        while(rs.next()){
            
            MovieDAO peliculaNueva = new MovieDAO();
            
            peliculaNueva.setId(rs.getInt(1));
            peliculaNueva.setTitulo(rs.getString(2));
            peliculaNueva.setDirector(rs.getString(3));
            peliculaNueva.setAnho(rs.getInt(4));
            peliculaNueva.setDuracion(rs.getInt(5));
            peliculaNueva.setGenero(rs.getString(6));
            
            listaPelicula.add(peliculaNueva);
        }
        return listaPelicula;
    }
}