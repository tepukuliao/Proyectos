/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba3.controller;

import com.mycompany.prueba3.model.MovieDAO;
import com.mycompany.prueba3.model.MovieDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tomac
 */
public class PeliculaController {
    
    public boolean agregarPeliculaController (MovieDAO peliculaNueva, Connection conexion) throws SQLException{
        MovieDTO pelicula = new MovieDTO();
        
        pelicula.agregarPelicula(peliculaNueva, conexion);
        
        return true;
    }
    
    public boolean modificarPeliculaController(MovieDAO peliculaNueva, Connection conexion)throws SQLException{
        MovieDTO pelicula = new MovieDTO();
        
        pelicula.modificarPeliculaID(peliculaNueva, conexion);
        return true;
        
    }
    
    public boolean buscarPeliculaController(MovieDAO peliculaBusqueda, Connection conexion)throws SQLException{
        MovieDTO pelicula = new MovieDTO();
        
        return pelicula.buscarPelicula(peliculaBusqueda, conexion);
       
    }
    
    public boolean eliminarPeliculaController(MovieDAO peliculaEliminar, Connection conexion)throws SQLException{
        MovieDTO pelicula = new MovieDTO();
        
        pelicula.eliminarPelicula(peliculaEliminar, conexion);
        return true;
    }
    
    public ArrayList<MovieDAO> ListaPeliculaController(Connection conexion) throws SQLException{
        MovieDTO pelicula = new MovieDTO();
        
        return pelicula.ListaPelicula(conexion);
    }
}
