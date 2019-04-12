import java.util.Date;

public class EmpregadoMensal extends Empregado{
	
	public EmpregadoMensal(String nome, Date dataNascimento, String email, String telefone, 
			Date dataContratacao, Date dataDemissao, String matricula, Double salario) {
		
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
		this.salario = salario;
		
	}

	private Double salario;

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.salario; 
	}

}
