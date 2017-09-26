package UT10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Actualizar_Datos {
	static void UpdateEquipo(Connection con, String BDNombre) throws SQLException{
		String str2="UPDATE EQUIPO SET ESTADIO='ALBORAN' WHERE TEAM_ID=1";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(str2);
			stmt.close();
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}
	static void UpdateJugador(Connection con, String BDNombre) throws SQLException{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Numero de equipo");
		int num=teclado.nextInt();
		System.out.println("Numero de un dorsal");
		int num1=teclado.nextInt();
		System.out.println("Numero de un jugador");
		int num2=teclado.nextInt();
		Statement stmt = null;
		String cadena="UPDATE JUGADORES SET DORSAL="+num1+" WHERE PLAYER_ID="+num2+" AND TEAM_ID="+num;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(cadena);
			System.out.println("Dorsal actualizado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}
		finally{
			stmt.close();
		}
		
	}
	
}
