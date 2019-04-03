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

	public static void main(String[] args) {

		String[] opcoes = { "Livro", "Cenário 2", "Cenário 3" };

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 03", null);

			switch (opcao) {
			case 1:
				
				break;
			case 2:
				
				break;

			case -1:

				continua = false;
				break;
			}

		} while (continua);

		Livro livro01 = criarLivro();
		Livro livro02 = criarLivro();

		ArrayList<Livro> livros = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			livros.add(criarLivro());
		}

		System.out.println(livro01.getTitulo());

	}

	public static Livro criarLivro() {

		Livro livro = new Livro();

		String codigo = Console.recuperaTexto("Informe o código: ");
		livro.setCodigo(codigo);
		String titulo = Console.recuperaTexto("Informe o título: ");
		livro.setTitulo(titulo);

		ArrayList<String> autores = new ArrayList<>();
		Integer quantidade = Console.recuperaInteiroPositivo("Quantos autores: ");
		for (int i = 0; i < quantidade; i++) {

			String autor = Console.recuperaTexto("Informe o Autor " + (i + 1) + ":");
			autores.add(autor);
		}

		livro.setAutores(autores);
		String isbn = Console.recuperaTexto("Informe o ISBN: ");
		livro.setIsbn(isbn);
		Integer ano = Console.recuperaInteiroPositivo("Informe o ano: ");
		livro.setAno(ano);

		return livro;

	}

	public static void executarCenario3() {
		Paciente p1 = new Paciente("00021", "Fulano da Silva");
		Paciente p2 = new Paciente("00171", "Ciclano dos Santos");
		p2.addHistorico("Dor");
	}

	/**
	 * Executar o Cenario 2
	 */
	public static void executarCenario2() {
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto(2d, 5d);

		Double dp1p2 = ponto1.distancia(ponto2);
		System.out.println("dp1p2 = " + dp1p2);

		Double dp272 = ponto1.distancia(2d, 7.2);
		System.out.println("dp272 = " + dp272);

	}

}
