package com.alex.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.dao.VentaDAO;
import com.alex.model.Venta;

public class Insert_Ventas {

	public static void insertVentas() {
		// TODO Auto-generated method stub
		Connection conexion = ConexionJDBC.abrirConexionBBDD();
		Statement stm = null;
		VentaDAO ventadao = new VentaDAO();
		try {
			for (int i = 1; i <= 1000; i++) {
				int idproducto = (int) (Math.random() * 99 + 1);
				int idalmacen = (int) (Math.random() * 10 + 1);
				int año = 2014 + (int) (Math.random() * 6 + 1);

				Venta ventas = new Venta(i, idproducto, idalmacen, año);

				stm = conexion.createStatement();
				stm.execute(ventadao.insertSQL(ventas));
			}
			conexion.close();
			stm.close();
			System.out.println("VENTAS INSERTADAS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
