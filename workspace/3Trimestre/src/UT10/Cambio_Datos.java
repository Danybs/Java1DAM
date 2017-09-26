package UT10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Cambio_Datos {
	static Scanner teclado=new Scanner(System.in);
	static void UpsateEdad(Connection con, String BDNombre) throws SQLException{
		
		System.out.println("Dime valor del incremento edad");
		int num1=teclado.nextInt();
		System.out.println("Dime numero de equipo");
		int num2=teclado.nextInt();
		Statement stmt = null;
		String cadena = "SELECT EDAD FROM JUGADORES";
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(cadena);
			while (rs.next()) {
				int v1 = rs.getInt("EDAD");
				int edadT=v1+num1;
				rs.updateInt("EDAD",edadT);
				rs.updateRow();
			}
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}
	static void InsertarEquipo(Connection con, String BDNombre) throws SQLException{
		Statement stmt=null;
		System.out.println("Introducir ID equipo");
		int v1=teclado.nextInt();
		String basura=teclado.nextLine();
		System.out.println("Introducir Nombre del equipo");
		String v2=teclado.nextLine();
		System.out.println("Introduce nombre del estadio");
		String v3=teclado.nextLine();
		System.out.println("Introduce poblacion");
		String v4=teclado.nextLine();
		System.out.println("Introduce provincia");
		String v5=teclado.nextLine();
		System.out.println("Introduce codigo postal");
		String v6=teclado.nextLine();
		System.out.println("-----------------------------");
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String cadena = "SELECT TEAM_ID,EQ_NOMBRE,ESTADIO,POBLACION,PROVINCIA,COD_POSTAL FROM EQUIPO";
			ResultSet rs = stmt.executeQuery(cadena);
				rs.moveToInsertRow();
				rs.updateInt("TEAM_ID", v1);
				rs.updateString("EQ_NOMBRE", v2.toUpperCase());
				rs.updateString("ESTADIO", v3.toUpperCase());
				rs.updateString("POBLACION", v4.toUpperCase());
				rs.updateString("PROVINCIA", v5.toUpperCase());
				rs.updateString("COD_POSTAL", v6);
				rs.insertRow();
			Leer_Datos.ReadEquipos(con, "xe");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}
		finally {
			stmt.close();
		}
	}
}
