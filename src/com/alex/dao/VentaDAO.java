package com.alex.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.interfaces.IVentaDAO;
import com.alex.model.Almacen;
import com.alex.model.Venta;

public class VentaDAO implements IVentaDAO {

	@Override
	public String insertSQL(Venta venta) {
		
		String sentenciaSQL="INSERT INTO ventas (idventa,idproducto,idalmacen,fecha)  VALUES ('"+venta.getIdventa()+"','"+venta.getIdproducto()+
				"','"+venta.getIdalmacen()+"','"+venta.getFecha()+"')";
		return sentenciaSQL;
	}

}
