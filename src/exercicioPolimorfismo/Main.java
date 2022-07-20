package exercicioPolimorfismo;

public class Main {

	public static void main(String[] args) {

		ClasseMae[] classe = new ClasseMae[] {new Filha01(), new Filha02(), new ClasseMae()};
		
		for (ClasseMae classeMae : classe) {
			classeMae.metodo1();
		}
		
		System.out.println("");
		
		for (ClasseMae classeMae : classe) {
			classeMae.metodo2();
		}
	}

}
