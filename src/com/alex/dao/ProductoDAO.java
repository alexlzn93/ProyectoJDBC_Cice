package com.alex.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.interfaces.IProductoDAO;
import com.alex.model.Almacen;
import com.alex.model.Producto;

public class ProductoDAO implements IProductoDAO {

	@Override
	public String insertSQL(Producto product) {
		String sentenciaSQL="INSERT INTO productos (id,nombre,precio)  VALUES ('"+product.getId()+"','"+product.getNombre()+
				"','"+product.getPrecio()+"')";
		return sentenciaSQL;
	}

}
