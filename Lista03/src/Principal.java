

/**
 * Classe Principal da Lista de Exercicios 03.
 * 
 * @author 1829799
 *
 */
public class Principal {

	public static void main(String[] args) {

		String[] opcoes = { "Calcular Peso Ideal",
							"Converter Decimal em Octadecimal" };

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 03", null);

			switch (opcao) {
			case 1:
				calcularPesoIdeal();
				break;
			case 2:
				converterDecimalBase8();
				break;

			case -1:

				continua = false;
				break;
			}

		} while (continua);

	}

	private static void converterDecimalBase8() {
		
		int num = Console.recuperaInteiro("Informe um numero inteiro: ");
		
		String base8 = Exercicios.converterDecimalBase8(num);
		
		System.out.println(base8);
		
	}

	/**
	 * Calcular Peso Ideal
	 */
	public static void calcularPesoIdeal() {

		String sexo = Console.recuperaTexto("Informe o Sexo: (M) para masculino (F) para feminino: ");
		double altura = Console.recuperaDecimal("Informa Altura:");

		double pesoIdeal = Exercicios.calcularPesoIdeal(sexo, altura);

		System.out.printf("Peso ideal: %.2f\n\n", pesoIdeal);
	}
	
	
}
