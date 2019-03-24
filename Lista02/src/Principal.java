import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		String[] opcoes = { "Mostrar Vetor Primitivo",
							"Maior Elemento",
							"Menor Elemento",
							"Vetor Invertido",
							"Multiplicar Dois Vetores",
							"Produto Escalar de Dois Vetores",
							"Produto Números Pares",
							"Ordenar Maior",
							"Serie Fibonacci",
							"Analisar Vetor",
							"Mesclar Vetores"};

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
			case 6:
				produtoEscalarDeDoisArray();
				break;
			case 7:
				produtoNumerosPares();
				break;
			case 8:
				ordenarMaior();
				break;
			case 9:
				criarSerieFibonacci();
				break;
			case 10:
				AnalisarVetor();
				break;
			case 11:
				mesclarVetores();
				break;
			case -1:

				continua = false;
				break;
			}

		} while (continua);
	}
	
	/**
	 * Mesclar elementos de dois vetores
	 */
	public static void mesclarVetores() {
		System.out.println("Criar arrayA");
		int[] arrayA = criarVetorInteiro();
		System.out.println("Criar arrayB");
		int[] arrayB = criarVetorInteiro();
		
		ArrayList<Integer> arrayC = Exercicios.mesclarVetores(arrayA, arrayB);
		
		System.out.println(arrayC);
		
	}
	
	private static void ordenarMaior() {
		System.out.println("Criar Vetor");
		double[] vetor = criarVetorDouble();
				
		ArrayList<Double> resultado = Exercicios.ordenarMaior(vetor);
	
		System.out.println(resultado);
		
	}
	
	/**
	 * Analise de um vetor (Maior, Menor, Soma e Média dos elementos de um vetor
	 */
	private static void AnalisarVetor() {
		System.out.println("Criar array");
		double[] A = criarVetorDouble();
				
		ArrayList<Double> resultado = Exercicios.AnalisarVetor(A);
	
		System.out.println(resultado);
		
	}
	
	/**
	 * Cria Serie Fibonacci
	 */
	public static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe o Tamanho da Sequencia: ");
		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println(fiboArray);
	}
	
	/**
	 * Produto Escalar de dois vetores de inteiros.
	 */
	private static void produtoNumerosPares() {
		System.out.println("Criar array");
		int[] array = criarVetorInteiro();
				
		int resultado = Exercicios.produtoNumerosPares(array);
		
		System.out.println(resultado);
		
	}
	
	/**
	 * Produto Escalar de dois vetores de inteiros.
	 */
	private static void produtoEscalarDeDoisArray() {
		System.out.println("Criar arrayA");
		int[] arrayA = criarVetorInteiro();
		System.out.println("Criar arrayB");
		int[] arrayB = criarVetorInteiro();
		
		int resultado = Exercicios.produtoEscalarDeDoisArray(arrayA, arrayB);
		
		System.out.println(resultado);
		
	}

	/**
	 * Mulitiplica dois vetores de double.
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
		System.out.println("");
		
		for (int i = 0; i < quantidade; i++) {
			array[i] = Console.recuperaDecimal("Informe o " + (i + 1) + "º valor: ");
					
		}
		
		return array;
		
	}

}