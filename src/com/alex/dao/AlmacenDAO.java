package com.alex.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alex.bbdd.ConexionJDBC;
import com.alex.interfaces.IAlmacenDAO;
import com.alex.model.Almacen;

public class AlmacenDAO implements IAlmacenDAO {

	@Override
	public String insertSQL(Almacen almacen) {

		String sentenciaSQL = "INSERT INTO almacenes (id,nombre,ubicacion)  VALUES ('" + almacen.getId() + "','"
				+ almacen.getNombre() + "','" + almacen.getUbicacion() + "')";
		return sentenciaSQL;
	}

}
