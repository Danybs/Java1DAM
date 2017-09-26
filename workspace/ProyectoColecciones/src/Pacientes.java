import java.util.Comparator;

/**
 * 
 * @author Dani
 *
 */
public class Pacientes implements Comparator<Pacientes>, Comparable<Pacientes> {
	/*
	 * Si quisieramos ordenar por edad implementariamos la interface
	 * Comparable<Pacientes>
	 */
	private String nombre;
	private String dir;
	private int edad;

	public Pacientes() {
		/*
		 * Creamos un constructor sin parametros para que a la hora de crear el
		 * objeto comparador no nos pida los parametros y librandonos del error,
		 * (Manera poco elegante)
		 */
	}

	Pacientes(String nombre, String dir, int edad) {
		this.nombre = nombre;
		this.dir = dir;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pacientes [nombre=" + nombre + ", dir=" + dir + ", edad=" + edad + "]";
	}

	/** Comparable
	 * compareTo (ordenar por edad) Estamos cambiando el metodo compareto para
	 * que cuando busque los objetos existentes nos los ordene por edad ya que
	 * buscará la edad que se le pasa por parametro con la comparación de la que
	 * ya tiene y lo restará haciendo que si es menor salga un numero negativo,
	 * si es mayor salga un numero positivo y si es igual salga un 0.
	 */
	@Override
	public int compareTo(Pacientes o) {
		return getEdad() - o.getEdad();
	}

	/** Comparator
	 * compare (Ordenar por nombre) method--> String.compareTo(String1); Número
	 * positivo: la cadena 1 es mayor que la cadena 2. 0: las cadenas son
	 * iguales. Número negativo: la cadena 1 es menor que la cadena 2.
	 */
	@Override
	public int compare(Pacientes arg0, Pacientes arg1) {
		// TODO Auto-generated method stub
		String nom = arg0.getNombre();
		String nom1 = arg1.getNombre();
		return nom.compareToIgnoreCase(nom1);
	}

}
