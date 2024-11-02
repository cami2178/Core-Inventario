package com.inventaricore.clases;

public class ProductoElectrodomestico {

	private String nombre;
	private double precio;
	private int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public ProductoElectrodomestico(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible= 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Override
	public String toString() {
		return "----------\n" + "Producto:\nNombre: " + nombre + "\nPrecio: $" + precio + "\nCantidad Disponible: " + cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println(this.toString());
	}
	
	
	
}
