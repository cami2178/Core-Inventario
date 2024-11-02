package com.inventariocore;

import com.inventaricore.clases.Televisor;
import com.inventaricore.clases.computadoraPortatil;
import com.inventaricore.clases.tiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor tv1 = new Televisor("Smart tv Samsung", 180000.0, 12, 43, "HD");
		Televisor tv2 = new Televisor("Lg Led", 320000.0, 8, 50, "4K");
		computadoraPortatil notebook1 = new computadoraPortatil("Acer Swift X", 370000.0, 15, "ACER", 16, 12345);
		computadoraPortatil notebook2 = new computadoraPortatil("Lenovo IdeaPad 5", 260000.0, 6, "LENOVO", 8, 67890);		
		tiendaElectronica tienda = new tiendaElectronica();
		
		tienda.agregarProducto(tv1);
		tienda.agregarProducto(tv2);
		tienda.agregarProducto(notebook1);
		tienda.agregarProducto(notebook2);
		
		
		System.out.println("-------");
		tienda.productoDisponible();
		
		tienda.venta(tv2, 9);
		tienda.venta(notebook2, 6);
		tienda.venta(notebook2, 1);
		System.out.println("Productos disponibles post-ventas;");
		tienda.productoDisponible();
		
		//String busqueda1 = tienda.buscarProducto("Lenovo IdeaPad 5");
		//System.out.println(busqueda1);
	}

}
