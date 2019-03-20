import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		String[] opcoes = { "Metodos" };

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 02", null);

			switch (opcao) {
			case 1:
				int[] vetor = criarVetorInteiro();
				imprimeVetorInteiro(vetor);
				break;

			case -1:

				continua = false;
				break;
			}

		} while (continua);
	}

	/**
	 * Imprimi Vetores Primitivos Inteiros no formatos [1,2,3,...]
	 * 
	 * @param valores vetor
	 */
	
	public static ArrayList<Integer> criarArrayInteiro(){
		
		int quantidade = Console.recuperaInteiro("Informe a quantidade de Intens: ");
		ArrayList
		
		return array;
	}
	
	public static void imprimeVetorInteiro(int[] valores) {
		if (valores.length == 0) {
			System.out.print("[]");
		} else if (valores.length == 1) {
			System.out.print(valores[0]);
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ',');
			}
			System.out.println(valores[valores.length - 1]);
			System.out.print("]");
		}
	}

	/**
	 * Cria um vetor com a quantidade de itens informado
	 * 
	 * @return vetor
	 */
	public static int[] criarVetorInteiro() {

		int quantidade = Console.recuperaInteiro("Informe a Quantidade: ");
		int[] valores = new int[quantidade];
		for (int i = 0; i < quantidade; i++) {
			valores[i] = Console.recuperaInteiroPositivo("Informe o " + i + 1 + "º valor: ");
		}
		return valores;
	}

}