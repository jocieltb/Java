import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		String[] opcoes = { "Mostrar Vetor Primitivo",
							"Maior Elemento",
							"Menor Elemento",
							"Vetor Invertido",
							"Multiplicar Vetores"};

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 02", null);

			switch (opcao) {
			case 1:
				int[] vetor = criarVetorInteiro();
				imprimeVetorInteiro(vetor);
				ArrayList<Integer> array = criarArrayInteiro();
				System.out.println(array);
				break;
			case 2:
				ArrayList<Integer> maiores = criarArrayInteiro();
				Integer maior = Collections.max(maiores);
				System.out.println("O maior elemento do array " + maiores + " é " + maior + ".");
				break;
			case 3:
				ArrayList<Integer> menores = criarArrayInteiro();
				Integer menor = Collections.min(menores);
				System.out.println("O menor elemento do array " + menores + " é " + menor + ".");
				break;
				
			case 4:
				ArrayList<Integer> inverso = criarArrayInteiro();
				Collections.reverse(inverso);
				System.out.println(inverso);
				break;
			case 5:
				multiplicarVetores();
				break;
			case -1:

				continua = false;
				break;
			}

		} while (continua);
	}

	/**
	 * Mulitiplica dois vetores de double
	 */
	public static void multiplicarVetores() {
		System.out.println("Criar arrayA");
		double[] arrayA = criarVetorDouble();
		System.out.println("Criar arrayB");
		double[] arrayB = criarVetorDouble();
		
		ArrayList<Double> resultadoMultiplicacao = Exercicios.multiplicarArray(arrayA, arrayB);
		
		System.out.println(resultadoMultiplicacao);
		
	}
	/**
	 * Cria um ArrayList de inteiros
	 */
	public static ArrayList<Integer> criarArrayInteiro(){
		
		int quantidade = Console.recuperaInteiro("Informe a quantidade de Intens: ");
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			array.add(Console.recuperaInteiro("Informe o valor " + (i + 1) + ":"));
		}
		
		return array;
	}
	/**
	 * Imprimir vetor inteiro primitivo
	 * 
	 * @param valores
	 */
	public static void imprimeVetorInteiro(int[] valores) {
		if (valores.length == 0) {
			System.out.print("[]");
		} else if (valores.length == 1) {
			System.out.print(valores[0]);
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ",");
			}
			System.out.println(valores[valores.length - 1]);
			System.out.print("]");
		}
	}

	/**
	 * Cria um vetor de inteiros positivos com a quantidade de itens informado
	 * 
	 * @return vetor de inteiros
	 */
	public static int[] criarVetorInteiro() {

		int quantidade = Console.recuperaInteiro("Informe a Quantidade: ");
		int[] valores = new int[quantidade];
		for (int i = 0; i < quantidade; i++) {
			valores[i] = Console.recuperaInteiroPositivo("Informe o " + (i + 1) + "º valor: ");
		}
		
		return valores;
	}
	
	/**
	 * Cria um vetor double com a quantidade de itens informado
	 * 
	 * @return vetor de double
	 */
	public static double[] criarVetorDouble(){
		
		int quantidade = Console.recuperaInteiro("Informe a Quantidade: ");
		double[] array = new double[quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			array[i] = Console.recuperaDecimal("Informe o " + (i + 1) + "º valor: ");
					
		}
		
		return array;
		
	}

}