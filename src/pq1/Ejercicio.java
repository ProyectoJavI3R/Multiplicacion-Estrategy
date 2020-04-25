package pq1;

public class Ejercicio {//Contexto -> Encapsulamos Todos los algoritmos
	
	private IEstrategia estrategia;
	
	public Ejercicio (IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public float resolverMultiplicacion (int multiplicador, int multiplicado) {
		return this.estrategia.resolverProblema(multiplicador, multiplicado);
	}
	
}
