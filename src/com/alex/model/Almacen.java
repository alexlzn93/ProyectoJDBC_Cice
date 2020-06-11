package com.alex.model;

public class Almacen {
	
	/**
	 * ATRIBUTOS DE CLASE
	 */
	private int id;
	private String nombre;
	private String ubicacion;
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Almacen() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * CONSTRUCTOR CON TODOS LOS PARAMETROS
	 */
	public Almacen(int id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Almacen [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	
}

