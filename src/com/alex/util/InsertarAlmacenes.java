package com.alex.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.dao.AlmacenDAO;
import com.alex.model.Almacen;

public class InsertarAlmacenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// abro la conexion

		Connection conexion = ConexionJDBC.abrirConexionBBDD();
		Statement stm = null;
		AlmacenDAO almacendao = new AlmacenDAO();
		try {
			for (int i = 1; i <= 10; i++) {
				Almacen almacen = new Almacen(i, "almacen_" + i, "ubicacion_" + i);

				stm = conexion.createStatement();
				stm.execute(almacendao.insertSQL(almacen));
			}
			conexion.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ALMACENES INSERTADOS");
	}

}
