package com.alex.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDBC {

	
	
	public static Connection abrirConexionBBDD() {
		 String user="root";
		 String password="";
		 Connection conexion=null;
		
		String bbdd= "jdbc:mysql://localhost:3306/cicejdbc?user="+user+"&password="+password+"&serverTimezone=Europe/Madrid";
		try {
			conexion=DriverManager.getConnection(bbdd);
			if(conexion !=null) {
				System.out.println("Conexion establecida con exito");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No es posible conectarse a la base de datos");
			
		}
		return conexion;
	}
}
