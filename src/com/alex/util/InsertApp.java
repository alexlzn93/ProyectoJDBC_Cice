package com.alex.util;

import java.util.Scanner;

public class InsertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		System.out.println("Pulse 1 para insertar almacenes en la BBDD");
		System.out.println("Pulse 2 para insertar productos en la BBDD");
		System.out.println("Pulse 3 para insertar ventas en la BBDD");
		int numero= entrada.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Insertando almacenes....");
			Insert_Almacenes.insertAlmacenes();
			System.out.println("Almacenes insertados correctamente");
			break;
		case 2:
			System.out.println("Insertando productos....");
			Insert_Productos.insertProduct();
			System.out.println("Productos insertados correctamente");
			break;
		case 3:
			System.out.println("Insertando ventas....");
			Insert_Ventas.insertVentas();
			System.out.println("Ventas insertadas correctamente");
			break;

		}
		entrada.close();
	}

}
