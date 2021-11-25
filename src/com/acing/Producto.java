package com.acing;

public class Producto implements Comerciable {

	private char id;
	private String marcaProducto;
	private String nombreProducto;
	private String descripcionProducto;
	private float precioProducto;

	public char getId() {
		return id;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public void setId(char id) {
		this.id = id;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}

	public Producto() {
	}

	public Producto(String marcaProducto, String nombreProducto, String descripcionProducto, float precioProducto) {
		this.setMarcaProducto(marcaProducto);
		this.setNombreProducto(nombreProducto);
		this.setDescripcionProducto(descripcionProducto);
		this.setPrecioProducto(precioProducto);
	}

	public Producto(char id, String marcaProducto, String nombreProducto, String descricionProducto,
			float precioProducto) {
		this(marcaProducto, nombreProducto, descricionProducto, precioProducto);
		this.setId(id);
	}

	@Override
	public String toString() {
		return getDescripcionProducto() + " - " + getMarcaProducto();
	}

	@Override
	public String getDescripcion() {
		return null;
	}

	@Override
	public float getPrecio() {
		return 0;
	}

	// Todos los de abajo

}
