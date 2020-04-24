package pq1;

public class MultiplicacionRusa implements IMultiplicacion{
	
	public float resultado(int multiplicador, int multiplicando) {
		float resultado = 0f;
		
		while((multiplicador != 1)) {
			
			if(multiplicador % 2 != 0) {
				System.out.println(multiplicando);
				resultado += multiplicando;
			}
			multiplicador /= 2;
			multiplicando *= 2;
		}
		
		return resultado;
	}
	
}
