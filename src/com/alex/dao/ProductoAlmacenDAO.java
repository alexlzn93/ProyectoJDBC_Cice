package com.alex.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.interfaces.IProducto_Almacen;
import com.alex.model.Almacen;
import com.alex.model.Producto_Almacen;

public class ProductoAlmacenDAO implements IProducto_Almacen {

	@Override
	public String insertSQL(Producto_Almacen productoAlmacen) {
		
		String sentenciaSQL="INSERT INTO productos_almacen (id,idproducto,idalmacen,stock) VALUES ('"+productoAlmacen.getId()+"','"+productoAlmacen.getId_producto()+"','"+productoAlmacen.getId_almacen()+
				"','"+productoAlmacen.getStock()+"')";
		return sentenciaSQL;
	}

}
