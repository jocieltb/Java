import java.util.ArrayList;

/**
 * Class Principal
 * 
 * @author 1829799
 *
 */
public class Principal {

	public static void main(String[] args) {

		String[] opcoes = { "Lista de Contatos" };

		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 06", null);

			switch (opcao) {
			case 1:
				criarListaContatos();
				break;
			case 2:

				break;

			case -1:

				continua = false;
				break;
			}

		} while (continua);

	}

	private static void criarListaContatos() {

		ArrayList<Contato> contatos = new ArrayList<>();
		String[] opcoes = { "Inserir Contatos", "Listar Contatos" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Contatos", null);
			switch (opcao) {
			case 1:
				Contato novo = criarContato();
				contatos.add(novo);
				System.out.println("Contato adicionado!");
				break;

			case 2:
				System.out.println();
				for (Contato contato : contatos) {
					System.out.println(contato + "\n");
				}
				System.out.println();
				break;

			case -1:
				continua = false;
				System.out.println("Saindo dos contatos...");
				break;
			}
		} while (continua);

	}

	private static Contato criarContato() {

		int codigo = Console.recuperaInteiro("Informe o Codigo: ");
		String nome = Console.recuperaTexto("Informe o Nome: ");
		String telefone = Console.recuperaTexto("Informe o Telefone");

		String tipoContato = Console
				.recuperaTexto("Digite P para pessoal, C para comercial, ou qquer coisa para familiar: ");

		Contato contato = null;

		if ("P".equalsIgnoreCase(tipoContato)) {

			String celular = Console.recuperaTexto("Informe o celular: ");
			contato = new Pessoal(codigo, nome, telefone, celular);

		} else if ("C".equalsIgnoreCase(tipoContato)) {
			String empresa = Console.recuperaTexto("Informe a empresa: ");
			contato = new Comercial(codigo, nome, telefone, empresa);

		} else {
			String grauDeParentesco = Console.recuperaTexto("Informe o grau de parentesco: ");
			contato = new Familiar(codigo, nome, telefone, grauDeParentesco);
		}

		return contato;

	}

}
