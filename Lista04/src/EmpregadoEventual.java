import java.util.Date;

public class EmpregadoEventual extends Empregado {
	
	private Double valorContrato;
	
	public EmpregadoEventual(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double valorContrato) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
		this.valorContrato = valorContrato;
			
	}

	/**
	 * @return the valorContrato
	 */
	public Double getValorContrato() {
		return valorContrato;
	}

	/**
	 * @param valorContrato the valorContrato to set
	 */
	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	@Override
	public Double getValorAPagar() {
	
		return this.valorContrato;
	}

}
