/**
 * 
 */
package UT10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Dani
 *
 */

/*
 * Crear tabla equipo con una clave primaria entera llamada teamID no nula, con
 * un campo eq_Nombre cadena no nulo y longitud 40 con un campo estadio de
 * longitud 40 y poblacion 20 con un campo no nulo, provincia de 20 no nulo y
 * cod_postal de 5
 */
public class CrearTablas {

	public static void CreateEQUIPO(Connection con, String BDName) throws SQLException {
		String createString = "create table EQUIPO " + "(TEAM_ID integer NOT NULL," + "EQ_NOMBRE varchar(40) NOT NULL,"
				+ "ESTADIO varchar(40) NOT NULL," + "POBLACION varchar(20) NOT NULL,"
				+ "PROVINCIA varchar(20) NOT NULL," + "COD_POSTAL char(5)," + "PRIMARY KEY (TEAM_ID))";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(createString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}

	public static void CreateJugadores(Connection con, String BDName) throws SQLException {
		String CreateString ="CREATE TABLE JUGADORES"+
                "(PLAYER_ID INTEGER NOT NULL,"+
                "TEAM_ID INTEGER NOT NULL,"+
                "NOMBRE VARCHAR2(20) NOT NULL,"+
                "DORSAL INTEGER NOT NULL,"+
                "EDAD INTEGER NOT NULL,"+
                "CONSTRAINT  JUD_TID_FK FOREIGN KEY (TEAM_ID)REFERENCES EQUIPO(TEAM_ID),"+
                "CONSTRAINT JUD_PID_PK PRIMARY KEY (PLAYER_ID))";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(CreateString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Errores.printSQLException(e);
		} finally {
			stmt.close();
		}
	}
}
