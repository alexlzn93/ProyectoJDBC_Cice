package com.alex.model;

public class Producto_Almacen {
	/**
	 * ATRIBUTOS DE CLASE
	 */
	private int id;
	private int id_producto;
	private int id_almacen;
	private int stock;

	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Producto_Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * CONSTRUCTOR CON TODOS LOS PARAMETROS
	 */
	public Producto_Almacen(int id, int id_producto, int id_almacen, int stock) {
		super();
		this.id = id;
		this.id_producto = id_producto;
		this.id_almacen = id_almacen;
		this.stock = stock;
	}

	/**
	 * GETTER AND SETTER
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_almacen() {
		return id_almacen;
	}

	public void setId_almacen(int id_almacen) {
		this.id_almacen = id_almacen;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto_Almacen [id_almacen=" + id_almacen + ", id_producto=" + id_producto + ", stock=" + stock + "]";
	}
}
