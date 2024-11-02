package com.inventaricore.clases;

public class computadoraPortatil extends ProductoElectrodomestico {
	
	private String marca;
	private int memoriaRam;
	private int numeroSerie;
	
	public computadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRam,
			int numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.numeroSerie = numeroSerie;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Marca: " + marca );
		System.out.println("Memoria Ram: " + memoriaRam + "GB");
		System.out.println("Numero de Serie: " + numeroSerie);
		
	}

}
