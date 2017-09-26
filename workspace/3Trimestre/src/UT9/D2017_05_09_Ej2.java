package UT9;

public class D2017_05_09_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido p = new PedidoEspana();
		p.setImporteSinIva(10000);
		p.calculaImporteIVA();
		p.Visualiza();
		Pedido p1 = new PedidoLuxemburgo();
		p1.setImporteSinIva(10000);
		p1.calculaImporteIVA();
		p1.Visualiza();
	}
}

class Pedido {
	protected double importeSinIva;
	protected double importeIVA;
	protected double importeConIVA;

	public double getImporteSinIva() {
		return importeSinIva;
	}

	public void setImporteSinIva(double importeSinIva) {
		this.importeSinIva = importeSinIva;
	}

	public double getImporteIVA() {
		return importeIVA;
	}

	public void setImporteIVA(double importeIVA) {
		this.importeIVA = importeIVA;
	}

	public double getImporteConIVA() {
		return importeConIVA;
	}

	public void setImporteConIVA(double importeConIVA) {
		this.importeConIVA = importeConIVA;
	}

	void calculaIVA() {
		System.out.println("Generico");
	}

	void Visualiza() {
		System.out.println(
				"Pedido" + "\n" + "ImporteSinIVA" + getImporteSinIva() + "\n" + "ImporteConIVA" + getImporteConIVA());
	}

	void calculaImporteIVA() {
		this.calculaIVA();
		setImporteConIVA(getImporteSinIva() + getImporteIVA());
	}
}

class PedidoEspana extends Pedido {
	@Override
	void calculaIVA() {
		setImporteIVA(getImporteSinIva() * 0.18);
	}
}

class PedidoLuxemburgo extends Pedido {
	@Override
	void calculaIVA() {
		setImporteIVA(getImporteSinIva() * 0.15);
	}
}
