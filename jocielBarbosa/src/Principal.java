import java.util.ArrayList;

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
		String[] opcoes = { "Cadastrar", "Consultar" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Menu Empresa", null);
			switch (opcao) {
			
			case 1:
				Empresa nova = criarEmpresa();
				empresas.add(nova);
				System.out.println("Empresa adicionada!");
				break;
				
			case 2:
				consultarEmpresa();
				break;
				
			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;
			}

		} while (continua);

	}

	private static void menuNotasFiscais() {
		
		String[] opcoes = { "Cadastrar", "Consultar", "Excluir" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Menu Notas Fiscais", null);
			switch (opcao) {
			
			case 1:
				
				break;

			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;
			}

		} while (continua);
		
	}

	private static void consultarEmpresa() {
		
		String consultaEmpresa = Console.recuperaTexto("Informe qual empresa deseja consultar: ");
		System.out.println();
		for (Empresa empresa : empresas) {
			if (consultaEmpresa.equalsIgnoreCase(empresa.getNome())) {
				String excluir = Console.recuperaTexto("Deseja excluir esta empresa (S para sim, qquer coisa para não): ");
				if (excluir.equalsIgnoreCase("S")) {
					empresas.remove(0);
					System.out.println("Empresa Excluida...");
					
				} else {
					menuNotasFiscais();
				}
			}
		}
		
	}

	private static Empresa criarEmpresa() {

		String nome = Console.recuperaTexto("Digite o nome da empresa");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa");
		Empresa empresa = new Empresa(nome, cnpj);
		empresa.setNome(nome);
		empresa.setCnpj(cnpj);

		ArrayList<Empresa> empresas = new ArrayList<>();

		empresas.add(empresa);

		return empresa;

	}

}