import java.util.ArrayList;
import java.util.Date;

/**
 * Classe principal da aplicação
 * 
 * @author 1829799
 *
 */
public class Principal {

	static ArrayList<Empresa> empresas = new ArrayList<>();

	/**
	 * Executa o metodo da main
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/**
		 * Menu Principal
		 */

		ArrayList<Empresa> empresas = new ArrayList<>();
		String[] opcoes = { "Empresas", "Notas Fiscais", "Relatórios" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Sistema de Notas", null);
			switch (opcao) {

			case 1:
				menuEmpresa();
				break;

			case 2:

				break;

			case 3:

				break;

			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;
			}

		} while (continua);

	}

	private static void menuEmpresa() {

		String[] opcoesMenuEmpresas = { "Cadastrar", "Consultar", "Excluir" };
		boolean continua = true;
		String buscaCNPJ;
		int index = 0;
		do {
			int opcaoMenuEmpresas = Console.mostrarMenu(opcoesMenuEmpresas, "Empresas", null);

			switch (opcaoMenuEmpresas) {

			case 1: // Adicionar
				criarEmpresa();
				System.out.println("Empresa adicionada!");
				System.out.println();
				break;

			case 2: // Consultar
				
				buscaCNPJ = Console.recuperaTexto("Informe o CNPJ: ");
				index = consultarEmpresa(buscaCNPJ);
				
				if (index >= 0) {
					System.out.println(empresas.get(index));
					System.out.println();

				} else {
					System.out.println("CNPJ não entrado...");
					System.out.println();
				}

				break;
			case 3: // Excluir

				buscaCNPJ = Console.recuperaTexto("Informe o CNPJ: ");
				index = consultarEmpresa(buscaCNPJ);

				if (index >= 0) {
					System.out.println();
					String confirmacao = Console.recuperaTexto("Deseja excluir essa empresa? Sim(S) Não(N): ");
					if (confirmacao.equalsIgnoreCase("s")) {
						empresas.remove(index);
						System.out.println("Empresa Excluida!");
					} else {
						System.out.println("Exclusão cancelada...");
					}
				}

				break;

			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;
			}

		} while (continua);

	}

	private static void menuNotaFiscal() {

		String[] opcoes = { "Emitir", "Consultar", "Cancelar" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Notas Fiscais", null);
			switch (opcao) {

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;
			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}

		} while (continua);

	}

	private static void menuRelatorios() {

		String[] opcoes = { "Por Empresas", "Por Valor", "Notas Canceladas" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Relatórios", null);
			switch (opcao) {

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;
			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}

		} while (continua);

	}

	/**
	 * Localiza uma empresa no ArrayList empresas
	 * @param cnpj parametro de busca
	 * @return um int (index do ArrayList empresas)
	 */
	private static int consultarEmpresa(String cnpj) {

		String consultarEmpresa = cnpj;
		int i = -1;
		for (Empresa empresa : empresas) {
			i++;
			if (consultarEmpresa.equalsIgnoreCase(empresa.getCnpj())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Cria uma empresa
	 * 
	 */
	private static void criarEmpresa() {

		String nome = Console.recuperaTexto("Digite o nome da empresa");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa");
		Empresa empresa = new Empresa(nome, cnpj);

		empresas.add(empresa);

	}

}