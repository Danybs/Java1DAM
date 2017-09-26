package UT9;

public class D2017_05_12_Ej3_Comentario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComentarioBueno c1 = new ComentarioBueno();
		ComentarioMalo c2= new ComentarioMalo();
		c1.comentar();
		c2.comentar();
	}

}
interface IComentario{
	public abstract void comentar();
}

class ComentarioBueno implements IComentario{
	public void comentar(){
		System.out.println("Hoy es viernes");
	}
}
class ComentarioMalo implements IComentario{

	@Override
	public void comentar() {
		// TODO Auto-generated method stub
		System.out.println("Hoy es lunes");
	}
	
}

