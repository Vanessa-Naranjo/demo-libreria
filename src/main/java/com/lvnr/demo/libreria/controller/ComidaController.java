package com.lvnr.demo.libreria.controller;

import com.lvnr.demo.libreria.dto.ComidaDto;
import com.lvnr.demo.libreria.service.ComidaService;

public class ComidaController {
	public static void main(String[] args) {
		ComidaService comidaService = new ComidaService();
		System.out.println("*****************************************");
		comidaService.bienvenida();
		System.out.println("*****************************************");
		comidaService.crearComida("Ajiaco", 12600, "Tipica");
		comidaService.crearComida("Hamburguesa", 10200, "Chatarra");
		comidaService.crearComida("Ensalada", 9500, "Saludable");
		System.out.println("*****************************************");
		comidaService.imprimirComida();
		System.out.println("*****************************************");
		ComidaDto comidaDto = comidaService.consultarComida("Hamburguesa");
		System.out.println("Nombre comida: " + comidaDto.getnombreComida());
		System.out.println("Precio comida: " + comidaDto.getprecio());
		System.out.println("Tipo comida: " + comidaDto.gettipoComida());
		
		System.out.println("*****************************************");
	

		String nombreComida="Perro Caliente";
		
		switch (nombreComida) {
		case "Ajiaco":
			System.out.println("El nombre de la comida es Ajiaco");
			break;
		case "Perro Caliente":
			System.out.println("El nombre de la comida es Perro Caliente");
			break;
		case "Hamburguesa":
			System.out.println("El nombre de la comida es Hamburguesa");
			break;
			default:
				System.out.println("El nombre de la comida no corresponde a ningun caso");
				break;
			
		}

	
	}
}
