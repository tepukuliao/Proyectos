/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba3.model;

import java.util.ArrayList;

/**
 *
 * @author tomac
 */
public class MovieDAO {
    private int id;
    private String titulo;
    private String director;
    private int anho;
    private int duracion;
    private String genero;

   

    public MovieDAO() {
        
    }

    public MovieDAO(int id, String titulo, String director, int anho, int duracion, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.anho = anho;
        this.duracion = duracion;
        this.genero = genero;
        
    }

    public MovieDAO(String titulo, String director, int anho, int duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.anho = anho;
        this.duracion = duracion;
        this.genero = genero;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "MovieDAO" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", anho=" + anho + ", duracion=" + duracion + ", genero=" + genero ;
    }


}