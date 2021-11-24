package com.acing;

import java.util.ArrayList;
import java.util.Collection;

public class Carrito {
	private Collection<Comerciable> productosCargados = new ArrayList<>();
	private float valorCarrito;
	
	public Collection<Comerciable> getProductosCargados() {
		return productosCargados;
	}
	
	public float getValorCarrito() {
		float valorFinalCarrito = 0;
		for (Comerciable producto : productosCargados) {
			valorFinalCarrito = + producto.getPrecio();
		}
		setValorCarrito(valorFinalCarrito);
		return valorCarrito;
	}
	
	public void setProductosCargados(Collection<Comerciable> productosCargados) {
		this.productosCargados = productosCargados;
	}
	
	public void setValorCarrito(float valorCarrito) {
		this.valorCarrito = valorCarrito;
	}
	
	public String getInfomeCarrito() {
//		((Collections) this.getProductosCargados()).sort(null);;
		String informeFinal = "";
		for (Comerciable comerciable : productosCargados) {
			informeFinal += comerciable.getPrecio() + " " + comerciable.getDescripcion();
		}
		
		return informeFinal;
	}
	
	public boolean estaCargado(Comerciable producto) {
		boolean estaDentroCarrito = false;
		if (productosCargados.contains(producto)) {
			estaDentroCarrito = true;
		} else {
			estaDentroCarrito = false;
		}
		return estaDentroCarrito;
	}
		
	public Carrito() {}
		
}
