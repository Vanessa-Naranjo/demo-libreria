package com.lvnr.demo.libreria.controller;

public class PruebaIFv2 {
	public static void main(String[] args) {
		int numeros = 10;

		if (numeros == 2) {
			System.out.println("El número es igual a 2");

		} else if (numeros == 3) {
			System.out.println("El número es igual a 3");
		} else if (numeros == 4) {
			System.out.println("El número es igual a 4");
		} else if (numeros == 10) {
			System.out.println("El número es igual a 10");
		}

		switch (numeros) {
		case 2:
			System.out.println("El número es igual a 2");
			break;
		case 3:
			System.out.println("El número es igual a 2");
			break;
		case 10:
			System.out.println("El número es igual a 10");
			break;
		default:
			System.out.println("El número no corresponde a ningun caso");
			break;
		}

		String nombre = "Camilo";

		switch (nombre) {
		case "Laura":
			System.out.println("El nombre es Laura");
			break;
		case "Camilo":
			System.out.println("El nombre es Camilo");
			break;
		case "Elena":
			System.out.println("El nombre es Elena");
			break;
		default:
			System.out.println("El nombre no corresponde a ningun caso");
			break;
		}

		String platoComida = "Bandeja Paisa";

		switch (platoComida) {
		case "Ajiaco":
			System.out.println("El plato de comida favorito es Ajiaco");
			break;
		case "Changua":
			System.out.println("El plato de comida favorito es Changua");
			break;
		case "Bandeja Paisa":
			System.out.println("El plato de comida favorito es Bandeja Paisa");
			break;
		default:
			System.out.println("El plato de comida favorito no corresponde con ningun caso");
			break;
		}

	}
}
