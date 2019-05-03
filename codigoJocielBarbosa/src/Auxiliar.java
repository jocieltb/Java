import java.util.ArrayList;
import java.util.Collections;

public class Auxiliar {
	static ArrayList<Empresa> empresas = new ArrayList<>();

	/**
	 * Cria uma empresa.
	 */
	public static void criarEmpresa() {

		String nome = Console.recuperaTexto("Digite o nome da empresa");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa");

		int index = encontrarIndexEmpresa(cnpj);

		if (index == -1) {
			Empresa empresa = new Empresa(nome, cnpj);
			empresas.add(empresa);
			System.out.println("Empresa cadastrada...");
			System.out.println();
		} else {
			System.out.println("CNPJ já cadastrado...");
		}
	}

	/**
	 * Realiza a consulta e retorno de uma empresa, para o menu de empresas.
	 */
	public static void consultaDeEmpresas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			System.out.println(pegarEmpresa(cnpj));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void calcularFaturamento() {

		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			Empresa empresa = pegarEmpresa(cnpj);
			Double faturamento = Faturamento.getSomaValorNotas(empresa.GetNotasFiscaisValidas());
			System.out
					.println("\nFaturamento:\nEmpresa: " + empresa.getNome() + "\nFaturamento: " + faturamento + "\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Exclui uma empresa.
	 */
	public static void excluirEmpresa() {
		String cnpj = Console.recuperaTexto("Informe o CNPJ: ");
		int index = encontrarIndexEmpresa(cnpj);

		if (index >= 0) {
			String confirmacao = Console.recuperaTexto("Deseja excluir essa empresa? Sim(S) Não(N): ");
			if (confirmacao.equalsIgnoreCase("s")) {
				empresas.remove(index);
				System.out.println("Empresa Excluida!");
			} else {
				System.out.println("Exclusão cancelada...");
				System.out.println();
			}
		} else {
			System.out.println("CNPJ não encontrado...");
		}
	}

	/**
	 * Emite uma nota fiscal (Add no Arraylist notasFiscais do objeto empresa).
	 */
	public static void emitirNotas() {
		try {

			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			Empresa empresaSolicitada = pegarEmpresa(cnpj);
			ArrayList<NotaFiscal> notas = empresaSolicitada.getNotasFiscais();
			int numeroNota = empresaSolicitada.getNotasFiscais().size() + 1;
			empresaSolicitada.addNotaFiscal(criarNota(numeroNota));
			System.out.println("Nota Emitida...\n");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Consulta a nota fiscal da empresa desejada.
	 */
	public static void consultarNotas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			Empresa empresaSolicitada = pegarEmpresa(cnpj);
			String numeroNota = Console.recuperaTexto("Informe o número da nota: ");
			ArrayList<NotaFiscal> notas = empresaSolicitada.getNotasFiscais();

			for (NotaFiscal nota : notas) {
				if (numeroNota.equalsIgnoreCase(nota.getNumero())) {
					System.out.println(nota);
				} else {
					System.out.println("Nota não encontrada...");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Cancela a nota fiscal da empresa desejada.
	 */
	public static void cancelarNotas() {

		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");

		try {

			System.out.println(pegarEmpresa(cnpj).GetNotasFiscaisValidas());
			String numeroNota = Console.recuperaTexto("Informe o número da nota ou zero para voltar: ");
			ArrayList<NotaFiscal> notas = pegarEmpresa(cnpj).getNotasFiscais();

			for (NotaFiscal nota : notas) {
				if (numeroNota.equalsIgnoreCase(nota.getNumero())) {

					if (nota.getValorComImposto() <= 10000) {
						nota.setCancelada(true);
						System.out.println("Nota cancelada...\n");
					} else if (nota.getValorComImposto() > 10000) {
						System.out.println("Notas com valores acima de R$ 10.000 não pode ser Canceladas\n");
					}

				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gera relatórios de notas válidas por empresa.
	 */
	public static void gerarRelatorioPorEmpresa() {

		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			System.out.println(pegarEmpresa(cnpj).GetNotasFiscaisValidas());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gera relatórios de notas ordenadas por valor.
	 */
	public static void gerarRelatorioPorValorDaNota() {
		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			ArrayList<NotaFiscal> notas = new ArrayList<>();
			notas = pegarEmpresa(cnpj).GetNotasFiscaisValidas();
			Collections.sort(notas, new ComparaValorNota());
			System.out.println(notas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gera relatórios de notas canceladas por empresa.
	 */
	public static void gerarRelatorioNotasCanceladas() {
		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			System.out.println(pegarEmpresa(cnpj).GetNotasFiscaisCanceladas());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Localiza uma empresa no ArrayList empresas, e retorna seu index.
	 * 
	 * @param cnpj Parâmetro de busca.
	 * @return Um inteiro com o index da empresa buscada.
	 */
	private static int encontrarIndexEmpresa(String cnpj) {

		int i = -1;
		for (Empresa empresa : empresas) {
			i++;
			if (cnpj.equalsIgnoreCase(empresa.getCnpj())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Cria uma Nota Fiscal.
	 * 
	 * @return Nota Fiscal.
	 */
	private static NotaFiscal criarNota(int numeroNota) {
		String numero = Integer.toString(numeroNota);
		String descricao = Console.recuperaTexto("Informe o motivo da nota: ");
		Double valor = Console.recuperaDecimal("Informe o valor da nota: ");
		Imposto imposto = null;
		boolean continua = true;

		do {
			int opcao = Console.recuperaInteiroPositivo(
					"Escolha o Estado:\n1) Paraná\n2) Santa Catarina\n3) São Paulo\n4) Amapá.");
			switch (opcao) {

			case 1:
				imposto = new ImpostoParana(valor);
				continua = false;
				break;

			case 2:
				imposto = new ImpostoSantaCatarina(valor);
				continua = false;
				break;

			case 3:
				imposto = new ImpostoSaoPaulo(valor);
				continua = false;
				break;
			case 4:
				imposto = new ImpostoAmapa(valor);
				continua = false;
				break;
			default:
				System.out.println("Número informado não corresponde a um Estado...\n");

			}

		} while (continua);

		NotaFiscal nota = new NotaFiscal(numero, descricao, imposto, valor);
		return nota;
	}

	/**
	 * Encontra uma empresa pelo cnpj, e retorna a empresa.
	 * 
	 * @return A empresa buscada.
	 * @throws Exception
	 */
	public static Empresa pegarEmpresa(String cnpj) throws Exception {

		if (encontrarIndexEmpresa(cnpj) == -1) {
			throw new Exception("CNPJ não encontrado...");
		} else {
			return empresas.get(encontrarIndexEmpresa(cnpj));
		}
	}

	public static void cancelarNotasEmLote() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			ArrayList<NotaFiscal> notas = pegarEmpresa(cnpj).getNotasFiscais();
			for (NotaFiscal nota : notas) {

				if (nota.getValorComImposto() <= 10000) {
					nota.setCancelada(true);
					System.out.println("Nota Nº " + nota.getNumero() + " cancelada...");
				} else {
					System.out.println(
							"Nota número " + nota.getNumero() + "\nNão pode ser cancelada (Valor excede R$ 10.000");
				}

			}
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
