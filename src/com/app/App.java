package com.app;

import com.acing.Carrito;
import com.acing.Producto;

public class App {

	public static void main(String[] args) {
		
		Producto producto01 = new Producto('1', "Hacendado", "Tomate", "Tomate de Mercadona", 3.45f);
		Producto producto02 = new Producto('2', "Oreo", "Galletas", "Galletas Oreo", 2.5f);
		Producto producto03 = new Producto('3', "Gillete", "Maquinilla", "Máquina para afeitar", 15);
		System.out.println(producto01);
		System.out.println(producto02 + "\n");
		Carrito carrito01 = new Carrito();
		carrito01.getProductosCargados().add(producto01);
		carrito01.getProductosCargados().add(producto02);
		System.out.println(carrito01.getProductosCargados().toString());
		carrito01.getProductosCargados().add(producto03);
		System.out.println(carrito01.getProductosCargados().toString());
		carrito01.getInfomeCarrito();
	}

}
