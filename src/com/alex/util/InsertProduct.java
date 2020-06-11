package com.alex.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.dao.ProductoAlmacenDAO;
import com.alex.dao.ProductoDAO;
import com.alex.model.Producto;
import com.alex.model.Producto_Almacen;

public class InsertProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = ConexionJDBC.abrirConexionBBDD();
		Statement stm = null;
		ProductoDAO productdao = new ProductoDAO();
		ProductoAlmacenDAO product_almacendao = new ProductoAlmacenDAO();
		try {
			for (int i = 1; i <= 100; i++) {
				int num = (int) (Math.random() * 100 + 1);
				int id_almacen = (int) (Math.random() * 9 + 1);
				int stock = (int) (Math.random() * 9 + 1);

				Producto producto = new Producto(i, "producto_" + i, num);
				Producto_Almacen product_almacen = new Producto_Almacen(i, id_almacen, stock);

				stm = conexion.createStatement();
				stm.execute(productdao.insertSQL(producto));
				stm.execute(product_almacendao.insertSQL(product_almacen));
			}
			conexion.close();
			stm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("PRODUCTOS INSERTADOS");
	}

}
