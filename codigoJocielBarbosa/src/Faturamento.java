import java.util.ArrayList;

public class Faturamento {
	
	/**
	 * @return the somaValorNotas
	 */
	public static Double getSomaValorNotas(ArrayList<NotaFiscal> notas) {
		
		Double somaValorNotas = 0d;
		
		for(NotaFiscal nota : notas) {
			
			somaValorNotas += nota.getValor(); 
		}
		
		return somaValorNotas;
		
	}

	
}
