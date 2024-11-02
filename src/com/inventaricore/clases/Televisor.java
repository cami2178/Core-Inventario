package com.inventaricore.clases;

public class Televisor extends ProductoElectrodomestico {
	
	private int tamañoPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tamaño de pantalla: " + tamañoPantalla + " pulgadas" );
		System.out.println("Resolucion: " + resolucion);
	}
	
	
}
 