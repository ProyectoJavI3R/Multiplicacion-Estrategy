package pq1;

public class Main {

	public static void main(String[] args) {
		
		IEstrategia multiplicacion = new MultiplicacionRusa();
		System.out.println(multiplicacion.resultado(37, 12));
	}

}
