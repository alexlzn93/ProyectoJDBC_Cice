package com.alex.model;

public class Producto {

	/**
	 * ATRIBUTOS DE CLASE
	 */
	private int id;
	private String nombre;
	private double precio;
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * CONSTRUCTOR CON TODOS LOS PARAMETROS
	 */
	public Producto(int id, String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * GETTER AND SETTER
	 * 
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
