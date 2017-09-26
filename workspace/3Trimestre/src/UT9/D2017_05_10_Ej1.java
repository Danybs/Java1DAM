package UT9;

public class D2017_05_10_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche1 cochesp;
		cochesp = new CochePeninsula();
		cochesp.calculaCoste(12000F);
		System.out.println(cochesp.Visualiza());
		Coche1 cochecan;
		cochecan = new CocheCanarias();
		cochecan.calculaCoste(12000F);
		System.out.println(cochecan.Visualiza());
	}

}

abstract class Coche1 {
	protected float importeFabrica;
	protected float importeCoste;

	public float getImporteFabrica() {
		return importeFabrica;
	}

	public void setImporteFabrica(float importeFabrica) {
		this.importeFabrica = importeFabrica;
	}

	public float getImporteCoste() {
		return importeCoste;
	}

	public void setImporteCoste(float importeCoste) {
		this.importeCoste = importeCoste;
	}

	abstract void calculaCoste(float implugar);

	String Visualiza() {
		return "El importe con costes sera: " + getImporteCoste();
	}

}

class CocheCanarias extends Coche1 {

	@Override
	void calculaCoste(float implugar) {
		// TODO Auto-generated method stub
		setImporteFabrica(implugar);
		setImporteCoste(getImporteFabrica() * 1.06F);
	}

}

class CochePeninsula extends Coche1 {

	@Override
	void calculaCoste(float implugar) {
		// TODO Auto-generated method stub
		setImporteFabrica(implugar);
		setImporteCoste(getImporteFabrica() * 1.03F);
	}

}