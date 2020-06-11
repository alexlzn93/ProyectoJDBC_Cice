package com.alex.model;

import java.util.Date;

public class Venta {

	/**
	 * ATRIBUTOS DE CLASE
	 */
	private int idventa;
	private int idproducto;
	private int idalmacen;
	private int fecha;
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * CONSTRUCTOR CON TODOS LOS PARAMETROS
	 */
	public Venta(int idventa, int idproducto, int idalmacen, int fecha) {
		super();
		this.idventa = idventa;
		this.idproducto = idproducto;
		this.idalmacen = idalmacen;
		this.fecha = fecha;
	}
	/**
	 * GETTER AND SETTER
	 */
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdalmacen() {
		return idalmacen;
	}
	public void setIdalmacen(int idalmacen) {
		this.idalmacen = idalmacen;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Venta [idventa=" + idventa + ", idproducto=" + idproducto + ", idalmacen=" + idalmacen + ", fecha="
				+ fecha + "]";
	}
	
	
}
