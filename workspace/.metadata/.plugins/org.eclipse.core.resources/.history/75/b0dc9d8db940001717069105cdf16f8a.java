package UT10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String BaseDatos="jdbc:oracle:thin:@192.168.1.156:1521:orcl";
			Connection conexion=DriverManager.getConnection(BaseDatos, "PROGRAMACIÓN", "programacion");
			if(conexion!=null)
				System.out.println("conexion exitosa");
			else
				System.out.println("conexion fallida");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
