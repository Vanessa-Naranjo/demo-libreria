package com.lvnr.demo.libreria.controller;

import com.lvnr.demo.libreria.dto.LibroDto;
import com.lvnr.demo.libreria.service.LibroService;

public class LibroController {
    public static void main(String[] args) {
        LibroService libroService = new LibroService();

        System.out.println("******BIENVENIDA******");
        libroService.bienvenida();

        System.out.println("******CREAR LIBRO******");
        libroService.crearLibro("El poder de la palabra", "Carlos Martinez", 100);
        libroService.crearLibro("Las siete maravillas", "Anonimo", 150);
        libroService.crearLibro("Cambia tus pensamientos negativos", "Erika Salamanca", 50);


        System.out.println("*****IMPRIMIR LIBROS*****");
        libroService.imprimirLibros();

        System.out.println("******CONSULTAR LIBRO******");
        LibroDto libroDto = libroService.consultarLibro("El poder de la palabra");
        System.out.println("Nombre libro: " +libroDto.getNombreLibro());
        System.out.println("Autor: " +libroDto.getAutor());
        System.out.println("Paginas: " +libroDto.getPaginasLibro());

    }
}
