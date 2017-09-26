
public class Contactos {
	private String nombre;
	private String dir;
	private String tel;
	
	public Contactos(String nombre,String dir,String tel){
		this.nombre=nombre;
		this.dir=dir;
		this.tel=tel;
		
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
