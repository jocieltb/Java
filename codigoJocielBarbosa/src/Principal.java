
/**
 * Classe principal da aplicação.
 * 
 * @author 1829799
 *
 */
public class Principal {

	/**
	 * Executa o método da main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = { "Empresas", "Notas Fiscais", "Relatórios" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Sistema de Notas", null);
			switch (opcao) {

			case 1:
				menuEmpresa();
				break;
			case 2:
				menuNotaFiscal();
				break;
			case 3:
				menuRelatorios();
				break;
			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;
			}
		} while (continua);
		System.out.println();
	}

	/**
	 * Executa o menu de empresa.
	 */
	private static void menuEmpresa() {

		String[] opcoesMenuEmpresas = { "Cadastrar", "Consultar", "Faturamento", "Excluir" };
		boolean continua = true;
		do {
			int opcaoMenuEmpresas = Console.mostrarMenu(opcoesMenuEmpresas, "Empresas", "Voltar");
			switch (opcaoMenuEmpresas) {

			case 1:
				Auxiliar.criarEmpresa();
				break;
			case 2:
				Auxiliar.consultaDeEmpresas();
				break;
			case 3:
				Auxiliar.calcularFaturamento();
				break;
			case 4:
				Auxiliar.excluirEmpresa();
				break;

			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}
		} while (continua);
		System.out.println();
	}

	/**
	 * Executa o menu de notas fiscais.
	 */
	private static void menuNotaFiscal() {

		String[] opcoes = { "Emitir", "Consultar", "Cancelar", "Cancelar em Lote" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Notas Fiscais", "Voltar");
			switch (opcao) {

			case 1:
				Auxiliar.emitirNotas();
				break;
			case 2:
				Auxiliar.consultarNotas();
				break;
			case 3:
				Auxiliar.cancelarNotas();
				break;
			case 4:
				Auxiliar.cancelarNotasEmLote();
				break;
				
			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}
		} while (continua);
		System.out.println();
	}

	/**
	 * Executa o menu de relatórios.
	 */
	private static void menuRelatorios() {

		String[] opcoes = { "Por Empresas", "Notas Canceladas", "Por Valor" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Relatórios", "Voltar");
			switch (opcao) {

			case 1:
				Auxiliar.gerarRelatorioPorEmpresa();
				break;
			case 2:
				Auxiliar.gerarRelatorioNotasCanceladas();
				break;
			case 3:
				Auxiliar.gerarRelatorioPorValorDaNota();
				break;
			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}
		} while (continua);
		System.out.println();
	}

}