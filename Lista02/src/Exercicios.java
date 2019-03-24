import java.util.ArrayList;

/**
 * Classe para executar os exercícios da lista 02
 * 
 * @author 1829799
 *
 */
public class Exercicios {
	
	/**
	 * Multiplica dois vetores de double
	 * @param arrayA Array de double
	 * @param arrayB Array de double
	 * @return ArrayList com resultado da multiplicação dos itens dos arrays
	 */
	public static ArrayList<Double> multiplicarArray(double[] arrayA, double[] arrayB) {

		ArrayList<Double> resultado = new ArrayList<>();

		for (int i = 0; i < arrayA.length; i++) {

			resultado.add(arrayA[i] * arrayB[i]);
		}

		return resultado;
	}

	/**
	 * Produto Escalar dois vetores de double
	 * @param arrayA Array de inteiros
	 * @param arrayB Array de inteiros
	 * @return Produto Escalar dos itens dos arrays
	 */
	public static int produtoEscalarDeDoisArray(int[] arrayA, int[] arrayB) {

		int resultado = 0;

		for (int i = 0; i < arrayA.length; i++) {

			resultado = resultado + (arrayA[i] * arrayB[i]);
		}

		return resultado;
	}
}
