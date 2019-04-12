import java.util.ArrayList;
import java.util.Date;

/**
 * @author 1829799
 *
 */
public class PrincipalEmpregado {

	public static void main(String[] args) {
		
		EmpregadoMensal lidia = new EmpregadoMensal("Lidia", new Date(), "lidia@up.br", "41 99985 4557",
				new Date(), new Date(), "142536", 5010.0d);
		
		EmpregadoHorista carlos = new EmpregadoHorista("Carlos", new Date(), "carlos@up.br",
				"41 99521 4125", new Date(), new Date(), "147852", 75.5d, 150);
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		
		empregados.add(lidia);
		empregados.add(carlos);
		
	FolhaPagamento.imprimirFolhaEmpregados(empregados);
		
	}
	
	
}
