package com.lvnr.demo.libreria.controller;

import com.lvnr.demo.libreria.dto.LibroDto;
import com.lvnr.demo.libreria.service.LibroService;

public class PruebaIFV3 {
	public static void main(String[] args) {
		String nombre = "Eduardo";
		LibroService libroservice = new LibroService();
		switch (nombre) {
		case "Eduardo":
			LibroDto librodto = new LibroDto("100 años de soledad", "Robin", 100);
			libroservice.agregarLibroLista(librodto);
			break;
		default:
			System.out.println("Este nombre no pertenece a ningun caso:" + nombre);
			break;
		}

		libroservice.imprimirLibros();
	}

}
