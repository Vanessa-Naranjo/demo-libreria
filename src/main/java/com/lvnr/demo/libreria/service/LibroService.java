package com.lvnr.demo.libreria.service;

import com.lvnr.demo.libreria.dto.LibroDto;

import java.util.ArrayList;
import java.util.List;

public class LibroService {
    private List<LibroDto> libros;

    public LibroService() {
        libros = new ArrayList<>();
    }

    public void bienvenida() {
        System.out.println("Hola, Bienvenido a la libreria Vanessa");
    }

    public void imprimirLibros() {
        for (int i = 0; i < libros.size(); i++) {
            LibroDto libros1 = libros.get(i);
            System.out.println("Nombre del libro: " + libros1.getNombreLibro());
            System.out.println("Autor:" + libros1.getAutor());
            System.out.println("Paginas Libro: " + libros1.getPaginasLibro());

        }
        
     
    }

    public void crearLibro(String nombreLibro, String autor, int paginasLibro) {
        LibroDto libro = new LibroDto(nombreLibro, autor, paginasLibro);
        this.libros.add(libro);
    }

    public LibroDto consultarLibro(String nombreLibro) {
        for (int i = 0; i < libros.size(); i++) {
            LibroDto libro = libros.get(i);
            if (libro.getNombreLibro().equals(nombreLibro)) {
                return libro;
            }
        }
        return null;
    }
    
    public void agregarLibroLista (LibroDto libro) {
    	this.libros.add(libro);
    }

}


