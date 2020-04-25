package pq1;

public class MultiplicacionRusa implements IMultiplicacion{
	
	public float resultado(int multiplicador, int multiplicando) {
		
		float resultado = 0f;
		
		do{
			
			if(multiplicador % 2 != 0) {
//				System.out.println(multiplicando);
				resultado += multiplicando;
			}
			System.out.println("M: " + multiplicador);
			multiplicador /= 2;
			multiplicando *= 2;
			
		} while((multiplicador != 1));
		
		return resultado;
		
	}
	
}
