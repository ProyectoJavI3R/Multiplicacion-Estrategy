package pq1;

public class Main {

	public static void main(String[] args) {
		
		Ejercicio ejercio = new Ejercicio( new MultiplicacionRusa() );
		
		System.out.println(ejercio.resolverMultiplicacion(37, 6));
	}

}
