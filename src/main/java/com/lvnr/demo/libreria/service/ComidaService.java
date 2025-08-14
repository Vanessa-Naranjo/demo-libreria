package com.lvnr.demo.libreria.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.libreria.dto.ComidaDto;

public class ComidaService {
	private List<ComidaDto> Comidas;

	public ComidaService() {
		Comidas = new ArrayList<>();
	}

	public void bienvenida() {
		System.out.println("Hola, Bienvenido al supermercado de Laura");
	}

	public void imprimirComida () {
		for (int i=0; i < Comidas.size(); i++){
			ComidaDto Comidas1= Comidas.get(i);
			System.out.println("Nombre de la comida: " +Comidas1.getnombreComida());
			System.out.println("El precio de la comida es: " +Comidas1.getprecio());
			System.out.println("Cantidad de la comida: " + Comidas1.gettipoComida());
		}
	}
		public void crearComida(String nombreComida, int precio, String tipoComida) {
			ComidaDto Comidas2=new ComidaDto(nombreComida,precio,tipoComida);
			this.Comidas.add(Comidas2);
			
		}
		
		public ComidaDto consultarComida (String nombreComida) {
			for (int i=0; i < Comidas.size(); i++) {
				ComidaDto Comidas2= Comidas.get(i);
				if (Comidas2.getnombreComida().equals(nombreComida)) {
					return Comidas2;
				}
				
			}
			return null;
	}

}
