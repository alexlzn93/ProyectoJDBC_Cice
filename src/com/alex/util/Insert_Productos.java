package com.alex.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.dao.ProductoAlmacenDAO;
import com.alex.dao.ProductoDAO;
import com.alex.model.Producto;
import com.alex.model.Producto_Almacen;

public class Insert_Productos {

	public static void insertProduct() {
		// TODO Auto-generated method stub
		Connection conexion = ConexionJDBC.abrirConexionBBDD();
		Statement stm = null;
		ProductoDAO productdao = new ProductoDAO();
		ProductoAlmacenDAO product_almacendao = new ProductoAlmacenDAO();
		try {
			for (int i = 1; i <= 100; i++) {
				int precio = (int) (Math.random() * 100 + 1);
				int id_almacen = (int) (Math.random() * 9 + 1);
				int stock = (int) (Math.random() * 9 + 1);

				Producto producto = new Producto(i, "producto_" + i, precio);
				
				Producto_Almacen product_almacen = new Producto_Almacen(i, i, id_almacen, stock);

				stm = conexion.createStatement();
				stm.execute(productdao.insertSQL(producto));
				stm.execute(product_almacendao.insertSQL(product_almacen));
			}
			conexion.close();
			stm.close();
			System.out.println("PRODUCTOS INSERTADOS");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
