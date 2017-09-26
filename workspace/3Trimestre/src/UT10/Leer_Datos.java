package UT10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Leer_Datos {
	static void ReadEquipos(Connection con, String BDNombre) throws SQLException {
		Statement stmt = null;
		String cadena = "SELECT TEAM_ID,EQ_NOMBRE,ESTADIO,POBLACION,PROVINCIA,COD_POSTAL FROM EQUIPO";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(cadena);
			while (rs.next()) {
				int v1 = rs.getInt("TEAM_ID");
				System.out.print(v1+" ");
				String v2 = rs.getString("EQ_NOMBRE");
				System.out.print(v2+" ");
				String v6 = rs.getString("ESTADIO");
				System.out.print(v6+" ");
				String v3 = rs.getString("POBLACION");
				System.out.print(v3+" ");
				String v5 = rs.getString("PROVINCIA");
				System.out.print(v5+" ");
				int v4 = rs.getInt("COD_POSTAL");
				System.out.print(v4+" ");
				System.out.println();
			}
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}
	
	static void ReadJugadores(Connection con, String BDNombre) throws SQLException {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dime numero de equipo");
		int num=teclado.nextInt();
		Statement stmt = null;
		String createString="select * " +
                "from JUGADORES "+
                "where TEAM_ID=" +num;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(createString);
			while (rs.next()) {
				int cod=rs.getInt(1);
	              System.out.println("Identificacion:"+cod);
	              int equipo=rs.getInt(2);
	              System.out.println("Equipo:"+equipo);
	              String nombre=rs.getString(3);
	              System.out.println("Nombre:"+nombre);
	              int dorsal=rs.getInt(4);
	              System.out.println("Dorsal:"+dorsal);
	              int edad=rs.getInt(5);
	              System.out.println("Edad:"+edad);
	              System.out.println("----------------------");
			}
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}

	}