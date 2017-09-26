package UT10;

import java.sql.SQLException;

public class Errores {
	public static void printSQLException(SQLException e)
	{
		e.printStackTrace(System.err);
		System.out.println("SQLState: "+e.getSQLState());
		System.out.println("Error Code: "+e.getErrorCode());
		System.out.println("Mesage: "+e.getMessage());
		Throwable t=e.getCause();
		while (t!=null){
			System.out.println("Cause: "+t);
			t=t.getCause();
		}
	}
}
