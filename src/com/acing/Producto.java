package com.acing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Producto implements List<Producto>, Comerciable {

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

	// Todos los de abajo

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<Producto> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(Producto e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Producto> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Producto> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public Producto get(int index) {
		return null;
	}

	@Override
	public Producto set(int index, Producto element) {
		return null;
	}

	@Override
	public void add(int index, Producto element) {

	}

	@Override
	public Producto remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<Producto> listIterator() {
		return null;
	}

	@Override
	public ListIterator<Producto> listIterator(int index) {
		return null;
	}

	@Override
	public List<Producto> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public String getDescripcion() {
		return null;
	}

	@Override
	public float getPrecio() {
		return 0;
	}
}
