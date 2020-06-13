package com.alex.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.dao.AlmacenDAO;
import com.alex.model.Almacen;

public class Insert_Almacenes {

	public static void insertAlmacenes() {

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
			System.out.println("ALMACENES INSERTADOS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
