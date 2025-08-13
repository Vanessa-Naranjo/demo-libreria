package com.lvnr.demo.libreria.dto;

public class LibroDto {
    private String nombreLibro;
    private String autor;
    private int paginasLibro;

    public LibroDto(){

    }

    public LibroDto(String nombreLibro, String autor, int paginasLibro){
        this.nombreLibro=nombreLibro;
        this.autor=autor;
        this.paginasLibro=paginasLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getPaginasLibro(){
        return paginasLibro;
    }
    public void setPaginasLibro(int paginasLibro){
        this.paginasLibro=paginasLibro;
    }
}
