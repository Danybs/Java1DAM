package UT3UT4;

public class D2016_11_14_Prisma {
	double largo,ancho,alto;
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	D2016_11_14_Prisma(double largo, double ancho, double alto){
		this.largo=largo;
		this.ancho=ancho;
		this.alto=alto;
	}
	
	@Override
	public String toString() {
		return "D2016_11_14_Prisma [largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + "]";
	}

	double volumen(){
		return (((this.largo*this.ancho)/2)*this.alto);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2016_11_14_Prisma objeto=new D2016_11_14_Prisma(12, 18, 24);
		System.out.println("Largo: "+objeto.getLargo());
		System.out.println("Ancho: "+objeto.getAncho());
		System.out.println("Alto: "+objeto.getAlto());
		System.out.println(objeto.volumen());
		objeto.setLargo(7);
		objeto.setAlto(12);
		objeto.setAncho(4);
		System.out.println(objeto.toString());
		System.out.println(objeto.volumen());
		
	}

}
