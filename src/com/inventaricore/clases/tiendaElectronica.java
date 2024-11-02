package com.inventaricore.clases;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;

public class tiendaElectronica {

	private ArrayList<ProductoElectrodomestico> listaProducto;

	public tiendaElectronica() {
		this.listaProducto = new ArrayList<>();
	}
	
	public void agregarProducto (ProductoElectrodomestico producto) {
		listaProducto.add(producto);
		System.out.println("Se ha agregado : " + producto.getNombre());
	}	
	
	public void productoDisponible() {
		System.out.println("Productos disponibles: ");
		for(ProductoElectrodomestico producto : listaProducto)
			producto.mostrarInformacion();
	
	}
	
	public String buscarProducto(String nombreProducto) {
		for(ProductoElectrodomestico producto : listaProducto) {
			if(producto.getNombre().equalsIgnoreCase(nombreProducto)) {
				return "Encontramos el producto:  " +  producto.getNombre();
			}
		}
		return "Producto no encontrado";
	}
	
	public void venta(ProductoElectrodomestico productoVenta, int cantidad) {
		for (int i = 0; i < listaProducto.size(); i++) {
			ProductoElectrodomestico producto = listaProducto.get(i);
			
			if(producto.equals(productoVenta)) {
				if(producto.getCantidadDisponible() > 0 && producto.getCantidadDisponible() >= cantidad) {
					producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
					System.out.println("Se ha realizado con exito la venta de " + "("+ cantidad +")" +" " + producto.getNombre());
				} else if (producto.getCantidadDisponible() == 0) {
						System.out.println("Lo sentimos, el producto " + producto.getNombre() + " se encuentra agotado");
					}else {
						System.out.println("No contamos con el stock suficiente para concretar la venta. Solo hay  " + producto.getCantidadDisponible() + " unidades disponibles en inventario");
					}
					break;
				}
			}
		}
	}

