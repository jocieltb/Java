/**
 * Classe para executar os exercícios da lista 03.
 * 
 * @author 1829799
 *
 */
public class Exercicios  extends Console {
	
	/**
	 * Primeiro fator fixo para utilização no calculo de peso ideal para homens
	 */
	public static final double FATOR_MASCULINO_1 = 72.7d;
	
	public static final double FATOR_MASCULINO_2 = 58;
	
	public static final double FATOR_FEMININO_1 = 62.1;
	
	public static final double FATOR_FEMININO_2 = 44.7;
	
	/**
	 * Calcular o peso ideal de uma pessoa baseado em sexo e altura
	 * @param sexo Utilize M para masculino e F para feminino
	 * @param altura Altura da pessoa
	 * @return Peso ideal
	 */
	public static double calcularPesoIdeal (String sexo, double altura) {
		double pesoIdeal = 0d;
		
		/*sexo == "M" - Metódeo não recomendade (Exceção)
		sexo.equals("M") - não reconhece letras minusculas
		sexo.equalsIgnoreCase("M") - Reconhece letras minuculas ou maiusculas */
		
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = altura * FATOR_MASCULINO_1 - FATOR_MASCULINO_2;
		}
		if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = altura * FATOR_FEMININO_1 - FATOR_FEMININO_2;
		}
		return pesoIdeal;
	}
	
	public static double converterCelciusParaFahrenheit(double C) {
		
		return (4.5 * C + 80) / 2.5;
		
	}

}
