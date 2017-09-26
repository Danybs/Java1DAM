package UT10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pruebas {
	static Scanner teclado = new Scanner(System.in);

	static void PReadJugadores1(Connection con, String BaseDatos) throws SQLException {
		System.out.println("Dime num equipo entre 1 y 3");
		int num = teclado.nextInt();
		String query = "SELECT * FROM JUGADORES WHERE TEAM_ID=" + num;
		try {
			Statement stmt = con.createStatement();
			 stmt.executeQuery(query);
			
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}
	}

	static void Cambio_Datos1(Connection con, String BaseDatos) throws SQLException {
		System.out.println("Dime la edad a incrementar");
		int edad = teclado.nextInt();
		System.out.println("Dime equipo del incremento");
		int equipo = teclado.nextInt();
		String query = "SELECT EDAD FROM JUGADORES WHERE TEAM_ID=" + equipo;
		try {
			Statement stmt = null;
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int edadA = rs.getInt("EDAD");
				int edadT = edadA + edad;
				rs.updateInt("EDAD", edadT);
				rs.updateRow();
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}
	}

	static void UpdateEquipo1(Connection con, String BaseDatos) {
		try {
			String cadena = "UPDATE EQUIPO SET ESTADIO='ALBORAN' WHERE TEAM_ID=1";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(cadena);
			Leer_Datos1(con,"xe");
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());

		}
	}

	static void LoadEquipo1(Connection con, String BaseDatos) {
		try {
			String cad1="INSERT INTO EQUIPO VALUES (5,'PERICO','HOLA','HOLA1','HOLA3',11111)";
			Statement st = con.createStatement();
			st.executeUpdate(cad1);
			st.close();
			Leer_Datos1(con,"xe");
		
		} catch (SQLException e) {
			// TODO: handle exception
			Errores.printSQLException(e);
		} 
	}
	static void Leer_Datos1(Connection con, String BaseDatos){
		try {
			String sql="SELECT * FROM EQUIPO";
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()){
				System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4)+" "+rs.getString(5)+ " "+rs.getString(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	static void InsertarEquipo1(Connection con, String BDNombre) throws SQLException{
		Scanner teclado=new Scanner(System.in);
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
			String cadena = "SELECT TEAM_ID,EQ_NOMBRE,ESTADIO,POBLACION,PROVINCIA,COD_POSTAL FROM EQUIPO";
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs =  st.executeQuery(cadena);
				rs.moveToInsertRow();
				rs.updateInt(1, v1);			
				rs.updateString(2, v2.toUpperCase());
				rs.updateString(3, v3.toUpperCase());
				rs.updateString(4, v4.toUpperCase());
				rs.updateString(5, v5.toUpperCase());
				rs.updateString(6, v6);
				rs.insertRow();
			Leer_Datos1(con,"xe");
			System.out.println("Dorsal actualizado");
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}		
	}
	static void UpdateJugador1(Connection con, String BDNombre) throws SQLException{
		System.out.println("Dime numero de equipo de un jugador");
		int num=teclado.nextInt();
		System.out.println("Dime numero de dorsal");
		int num2=teclado.nextInt();
		System.out.println("Dime numero de jugador");
		int num3=teclado.nextInt();
		try {
			String sql="UPDATE JUGADORES SET DORSAL="+num2+" WHERE PLAYER_ID="+num+" AND TEAM_ID="+num3;
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		}	
	}
	
}
