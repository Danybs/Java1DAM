package UT9;

public class D2017_05_09_letras {

	public static void main(String[] args) {
		B[] bs = new B[3];
		bs[0] = new B();
		bs[1] = new A();
		bs[2] = new C();
		naivePrinter(bs);

	}

	private static void naivePrinter(B[] bs) {
		for (int i = 0; i < bs.length; i++) {
			bs[i].print();
		}

	}

}

class A extends B {
	public void print() {
		System.out.println("A");
	}
}

class B {
	public void print() {
		System.out.println("B");
	}
}

class C extends B {
	public void print() {
		System.out.println("C");
	}

}