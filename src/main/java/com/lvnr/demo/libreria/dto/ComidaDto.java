package com.lvnr.demo.libreria.dto;

public class ComidaDto {
	private String nombreComida;
	private int precio;
	private String tipoComida;


	public ComidaDto() {

	}

	public ComidaDto(String nombreComida, int precio, String tipoComida) {
		this.nombreComida = nombreComida;
		this.precio = precio;
		this.tipoComida = tipoComida;

	}

	public String getnombreComida() {
		return nombreComida;
	}

	public void setnombreLibro(String nombreComida) {
		this.nombreComida = nombreComida;
	}

	public int getprecio() {
		return precio;
	}

	public void setprecio(int precio) {
		this.precio = precio;
	}

	public String gettipoComida() {
		return tipoComida;
	}

	public void settipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

}
