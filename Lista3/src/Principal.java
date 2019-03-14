
public class Principal {
	
	public static void main(String[] args) {
		
		String[] opcoes = {"Peso Ideal"};
		
		boolean continua = true;
		
		do {
			
			int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
			
			switch (opcao) {
			case 1:
				pesoIdeal();
				break;
			case -1:
				continua = false;
				break;
			}

			} while (continua);
			
		}
		
	}

public static void calcularPesoIdeal() {
	
	
	
}
	

