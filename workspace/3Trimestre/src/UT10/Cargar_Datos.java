package UT10;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Cargar_Datos {
	public static void LoadEQUIPO(Connection con, String BDNombre) throws SQLException {

		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(
					"INSERT INTO EQUIPO VALUES (" + "1,'ESTEPONA','MONTERROSO','ESTEPONA','MALAGA','29680')");
			stmt.executeUpdate(
					"INSERT INTO EQUIPO VALUES (" + "2,'ALCORCON','SANTO DOMINGO','ALCORCON','MADRID','28924')");
			stmt.executeUpdate("INSERT INTO EQUIPO VALUES (" + "3,'PORCUNA','SAN CRISTOBAL','PORCUNA','JAEN','23790')");
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}

	}

	public static void Cargar_Jugadores(Connection con, String BDNombre) throws SQLException {

		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "1,1,'JOSE ANTONIO',1,42)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "2,1,'IGNACIO',2,62)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "3,1,'DIEGO',3,20)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "4,2,'TURRION',1,37)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "5,2,'LUIS ABEL',2,37)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "6,2,'ISAAC',3,40)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "7,3,'JUAN FRANCISCO',1,33)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "8,3,'PARRA',2,37)");
			stmt.executeUpdate(
					"INSERT INTO JUGADORES VALUES (" + "9,3,'RAUL',3,19)");
		} catch (SQLException e) {
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}

	}
}
