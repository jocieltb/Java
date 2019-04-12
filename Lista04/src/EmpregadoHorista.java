import java.util.Date;

public class EmpregadoHorista extends Empregado{
	
	private Double salarioPorHora;
	private int quantidadeHoras;
	
	public EmpregadoHorista(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salarioPorHora, int quantidadeHoras) {
		
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
		this.salarioPorHora = salarioPorHora;
		this.quantidadeHoras = quantidadeHoras;
	}
		
	/**
	 * @return the salarioPorHora
	 */
	public Double getSalarioPorHora() {
		return salarioPorHora;
	}
	/**
	 * @param salarioPorHora the salarioPorHora to set
	 */
	public void setSalarioPorHora(Double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	/**
	 * @return the quantidadeHoras
	 */
	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}
	/**
	 * @param quantidadeHoras the quantidadeHoras to set
	 */
	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	@Override
	public Double getValorAPagar() {
		
		return this.salarioPorHora * this.quantidadeHoras;
	}
	

}
