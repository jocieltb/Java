import java.util.ArrayList;

/**
 * Classe para executar os exercícios da lista 02
 * 
 * @author 1829799
 *
 */
public class Exercicios {
	
public static ArrayList<Integer> criarSerieFibonacciComArray (int quantidade){
	
	ArrayList<Integer> fibonacci = new ArrayList<>();
	
	for (int i = 0; i < quantidade; i++) {
		if (i == 0 || i == 1) {
			fibonacci.add(1);
		} else {
			fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
		}
	}
	
	return fibonacci;
	
}

}
