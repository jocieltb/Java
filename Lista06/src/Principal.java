
/** Class Principal
 * 
 * @author 1829799
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		String[] opcoes = { "Lista de Contatos"};
		
		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(opcoes, "Lista 06", null);

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

	}		
	
	private static Contato criarContato() {
		
		
		
		int codigo = Console.recuperaInteiro("Informe o Codigo: ");
		String nome = Console.recuperaTexto("Informe o Nome: ");
		String telefone = Console.recuperaTexto("Informe o Telefone");
		
		
		
		String[] tipoContato = { "Pessoal", "Comercial", "Familiar"};
		
		boolean continua = true;

		do {

			int opcao = Console.mostrarMenu(tipoContato, "Tipo de Contato", null);

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
		
		Contato contato = null;
		
		
		
		contato.setCodigo(codigo);
		
		
		return contato;
				
	}

	private static Contato listarContato() {
	}

}


