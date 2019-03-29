import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe para executar os exercícios da lista 02
 * 
 * @author 1829799
 *
 */
public class Exercicios {
	
	/**
	 * Dicas Eclipse
	 * Alt+Shift+R - Renomear variaveis e metodos
	 */
	
	
	/**
	 * 11 - Mesclar elementos de dois vetores
	 * 
	 * @param arrayA Vetor A
	 * @param arrayB Vetor B
	 * @return Vetor C com elementos nas posições pares de A e Posições impares de B
	 */
	
	public static ArrayList<Integer> mesclarVetores(int[] arrayA, int[] arrayB) {

		ArrayList<Integer> arrayC = new ArrayList<>();

		for (int i = 0; i < arrayA.length; i++) {
			if (i % 2 == 0) {
				arrayC.add(arrayA[i]);
			} else {
				arrayC.add(arrayB[i]);
			}
		}

		return arrayC;
	}

	/**
	 * 10 - Analise de um vetor (Maior, Menor, Soma e Média dos elementos de um
	 * vetor
	 * 
	 * @param A VetorA
	 * @return VetorB com o resultado da analise
	 */
	public static ArrayList<Double> AnalisarVetor(double[] A) {

		ArrayList<Double> arrayA = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			arrayA.add(A[i]);
		}
		ArrayList<Double> arrayB = new ArrayList<>();
		arrayB.add(Collections.max(arrayA)); // Maior Elemento
		arrayB.add(Collections.min(arrayA)); // Menor Elemento

		Double soma = 0d;

		for (int i = 0; i < A.length; i++) {

			soma = soma + arrayA.get(i);
		}

		arrayB.add(soma); // Soma

		arrayB.add(soma / A.length); // Média

		return arrayB;

	}

	/**
	 * 9 - Cria um serie Fibonacci
	 * 
	 * @param quantidade Tamanho do Vetor
	 * @return Serie Fibonacci
	 */
	public static ArrayList<Integer> criarSerieFibonacciComArray(int quantidade) {

		ArrayList<Integer> fibonacci = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			if (i == 0 || i == 1) {
				fibonacci.add(1);
			} else {
				fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
			}
		}

		return fibonacci;

	}
	/**
	 * 8 - Ordena os maiores elementos para o final no vetor
	 * @param array Vetor de Double
	 */
	public static ArrayList<Double> ordenarMaior(double[] array) {

		ArrayList<Double> arrayA = new ArrayList<>();

		int cont = 0;

		for (int i = 0; i < array.length; i++) {

			arrayA.add(array[i]);
		}

		Double maior = Collections.max(arrayA);

		for (int i = 0; i < array.length; i++) {

			if (array[i] == maior) {
				cont++;
				arrayA.set(array.length - cont, array[i]); // maior no ultimo
				arrayA.set(i, array[array.length - cont]);
			}
		}

		return arrayA;
	}

	/**
	 * 7 - Produto dos números pares de um vetor
	 * 
	 * @param array de inteiros
	 * @return produto dos numeros pares
	 */
	public static int produtoNumerosPares(int[] array) {

		int resultado = 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && array[i] % 2 == 0) {

				resultado = resultado * array[i];
			}

			if (resultado == 1) {

				resultado = 0;

			}
		}

		return resultado;

	}

	/**
	 * 6 - Produto Escalar dois vetores de double
	 * 
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

	/**
	 * 5 - Multiplica dois vetores de double
	 * 
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

}
