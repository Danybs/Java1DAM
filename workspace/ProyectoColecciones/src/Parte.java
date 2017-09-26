/**
 * 
 * @author Dani
 *
 */

/*class Matricula {
	Matricula(String matricula){
		this.matricula=matricula;
	}
private String matricula;
}*/
public class Parte {
	@Override
	public String toString() {
		return "Parte [codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	Parte(String codigo, String descripcion, int importe){
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.importe=importe;
	}
	private String codigo;
	private String descripcion;
	private int importe;
}



