package com.lvnr.demo.libreria.controller;

import com.lvnr.demo.libreria.dto.LibroDto;

public class PruebaIF {
    public static void main(String[] args) {
        String nombre = "Vanessa";
        System.out.println("Utilizando equals y los valores deben ser igual en todo sentido");
        if (nombre.equals("esme")) {
            System.out.println("El nombre coincide con Vanessa");
        } else {
            System.out.println("El nombre NO coincide con Vanessa");
        }
        System.out.println("Utilizando equalsIgnoreCase");
        if (nombre.equalsIgnoreCase("laura")) {
            System.out.println("El nombre coincide con Vanessa");
        } else {
            System.out.println("El nombre NO coincide con Vanessa");
        }
        System.out.println("VALIDANDO NUMEROS");
        int numero = 5;
        if (numero == 7) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros NO son iguales");
        }

        if (numero > 5) {
            System.out.println("El numero es mayor a 5");
        } else {
            System.out.println("El numero no es mayor a 5");
        }
        if (numero >= 5) {
            System.out.println("El numero es mayor o igual a 5");
        } else {
            System.out.println("El numero es menor a 5");
        }
        if (numero <= 5) {
            System.out.println("El numero es menor o igual a 5");
        } else {
            System.out.println("El numero es mayor a 5");
        }

        numero = 2;
        if (numero > 5 && numero < 10) {
            System.out.println("El numero esta entre 6 y 9");
        } else {
            System.out.println("El numero no esta entre 6 y 9");
        }
        if (numero > 10 || numero < 5) {
            System.out.println("Este numero si entra dentro de la condición: " + numero);
        } else {
            System.out.println("El numero NO entra dentro de la condición: " + numero);
        }

        LibroDto libro = new LibroDto("comida", "anonimo", 100);
        if (libro.getNombreLibro().equals("comida")) {
            System.out.println("El nombre coincide con el libro");
        } else {
            System.out.println("El nombre NO coincide con el libro");
        }
        if (libro.getPaginasLibro() == 100) {
            System.out.println("El nombre coincide con el libro");
        } else {
            System.out.println("El nombre NO coincide con el libro");
        }

    }
}
