package UT10;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String BaseDatos = "jdbc:oracle:thin:@localhost:1521:xe";
			// select ora_database_name from dual; Sentencia SQL para ver el
			// nombre de la BD
			Connection conexion = DriverManager.getConnection(BaseDatos, "programacion", "programacion");
			if (conexion != null) {
				System.out.println("conexion exitosa");
				//CrearTablas.CreateEQUIPO(conexion, BaseDatos);
				//Cargar_Datos.LoadEQUIPO(conexion, BaseDatos);
				//CrearTablas.CreateJugadores(conexion, BaseDatos);
				//Cargar_Datos.Cargar_Jugadores(conexion, BaseDatos);
				//Leer_Datos.ReadEquipos(conexion, BaseDatos);
				//Leer_Datos.ReadJugadores(conexion, BaseDatos);
				//Cambio_Datos.UpsateEdad(conexion, BaseDatos);
				//Actualizar_Datos.UpdateEquipo(conexion, BaseDatos);
				//Cambio_Datos.InsertarEquipo(conexion,BaseDatos);
				//Actualizar_Datos.UpdateJugador(conexion, BaseDatos);
				Pruebas.PReadJugadores1(conexion, BaseDatos);
			} else
				System.out.println("conexion fallida");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
