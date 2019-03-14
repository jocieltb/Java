
/**
 * A classe principal vai fazer o que você quer que ela faça.
 * 
 * @author 1829799
 * @version 1.0
 * @since 28/02/2019
 */
public class Principal {

	/**
	 * Função para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	String[] opcoes = {"Enésimo termo da PA",
						"Distancia entre pontos",
						"Média Aritmética",
						"Média Ponderada",
						"Média Armônica"};
	
	boolean continua = true;
	
	do {
	
	int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
	
	switch (opcao) {
	case 1:
		calcularEnesimoTermoPa();
		break;
	case 2:
		calcularDistanciaEntreDoisPontos();
		break;
	case 3:
		calcularMediaAritimetica();
		break;
	case 4:
		calcularMediaPonderada();
		break;
	case 5:
		calcularMediaArmonica();
		break;
	case -1:
		continua = false;
		break;
	}

	} while (continua);
	
	}
	
	/**
	 * Execício 01 - Calcular enesimo termo da PA
	 */
	public static void calcularEnesimoTermoPa() {
		
		int a1 = Console.recuperaInteiro("Digite o termo a1: ");
		int n = Console.recuperaInteiro("Digite o n: ");
		int r = Console.recuperaInteiro("Digite a razão: ");

		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		System.out.println("Resultado: " + an);
	}
	
	/**
	 * Exercício 02 - Calcular distancia entre 2 pontos no plano cartesiano
	 */
	public static void calcularDistanciaEntreDoisPontos() {
		double x1 = Console.recuperaDecimal("Informe a coordenada x1: ");
		double y1 = Console.recuperaDecimal("Informe a coordenada y1: ");
		double x2 = Console.recuperaDecimal("Informe a coordenada x2: ");
		double y2 = Console.recuperaDecimal("Informe a coordenada y2: ");
		
		double distancia = Exercicios.calcularDistanciaEntreDoisPontos(x1, y1, x2, y2);
		
		System.out.printf("Distancia entre os 2 pontos %.2f", distancia);
		
	}
	
	/**
	 * Exercício 03 - Calcula a média aritimética de três notas 
	 */
	public static void calcularMediaAritimetica() {
		
		double n1 = Console.recuperaDecimal("Digite a 1ª Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2ª Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3ª Nota: ");
	
		double media = Exercicios.calcularMediaAritimetica(n1, n2, n3);
	
		System.out.printf("Média Aritimetica: %.2f", media);
			
	}
	
	/**
	 * Exercício 04 - Calcular a Média Ponderada de três notas
	 */
	public static void calcularMediaPonderada() {
		double n1 = Console.recuperaDecimal("Digite a 1ª Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2ª Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3ª Nota: ");
		
		double mediaP = Exercicios.calcularMediaPonderada(n1, n2, n3);
		
		System.out.printf("Média Ponderada: %.2f", mediaP);
	}
	
	/**
	 * Exercício 05 - Calcular a média armônica de três notas
	 */
	public static void calcularMediaArmonica () {
		
		double n1 = Console.recuperaDecimal("Digite a 1ª Nota: ");
		double n2 = Console.recuperaDecimal("Digite a 2ª Nota: ");
		double n3 = Console.recuperaDecimal("Digite a 3ª Nota: ");
		
		double mediaA = Exercicios.calcularMediaArmonica(n1, n2, n3);
		
		System.out.printf("Média Armônica: %.2f", mediaA);
	}
}
