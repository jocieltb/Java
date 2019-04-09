import java.util.ArrayList;

import Exercico01.Livro;
import Exercico02.Ponto;

/**
 * Classe Principal da Lista04
 * 
 * @author 1829799
 *
 */
public class Principal {

	/**
	 * Método de entrada de execução
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] opcoes = { "Livro", "Pontos", "Compromisso" };

		boolean continuar = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 04", null);

			switch (opcao) {
			case 1:

				break;
			case 2:
				executarCenario2();
				break;
			case 3:
				executarCenario3();
				break;
			case -1:
				continuar = false;
				System.out.println("Saindo do programa...");
				break;
			}
		} while (continuar);

	}

	/**
	 * Executa o Cenário 3
	 */
	private static void executarCenario3() {
		Paciente p1 = new Paciente("00021", "Fulano da Silva");
		Paciente p2 = new Paciente("000171", "Ciclano dos Santos");
		p2.addHistorico("Dor de cabeça");

		Compromisso c1 = new Compromisso(p1, "24/08/2005", "14h30min", "Beltrano Oliveira");
		Compromisso c2 = new Compromisso(p2, "26/08/2005", "17h", "João Camargo");

		p1.addHistorico("úlcera gástrica");
		p2.addHistorico("stress");
		p2.addHistorico("arritmia cardíaca");

		System.out.println(c1);
		System.out.println(c2);
	}

	/**
	 * Executa o Cenário 2
	 */
	private static void executarCenario2() {

		// Ponto na origem, coordenadas (0, 0)
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2d, 5d);

		double dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2: " + dp1p2);
		double dp272 = ponto2.distancia(7d, 2d);
		System.out.println("dp272: " + dp272);
		ponto1.setX(10d);
		ponto1.setY(3d);
		dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2: " + dp1p2);

	}

	/**
	 * Cria um Livro pelo teclado.
	 * 
	 * @return
	 */
	public static Livro criarLivro() {

		Livro livro = new Livro();

		String codigo = Console.recuperaTexto("Informe o código:");
		livro.setCodigo(codigo);
		String titulo = Console.recuperaTexto("Informe o título:");
		livro.setTitulo(titulo);

		ArrayList<String> autores = new ArrayList<>();
		Integer quantidade = Console.recuperaInteiro("Quantos autores?");
		for (int i = 0; i < quantidade; i++) {
			String autor = Console.recuperaTexto("Informe o autor " + (i + 1) + ":");
			autores.add(autor);
		}
		livro.setAutores(autores);

		String isbn = Console.recuperaTexto("Informe o ISBN:");
		livro.setIsbn(isbn);
		Integer ano = Console.recuperaInteiro("Informe o ano:");
		livro.setAno(ano);

		return livro;

	}

}
