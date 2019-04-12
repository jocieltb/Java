import java.util.Date;

public class EmpregadoComissionado extends Empregado{

	private Double valorComissao;
	private Double fixo;
	
	public EmpregadoComissionado(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salario) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula);
		
	}

	/**
	 * @return the salarioComissao
	 */
	public Double getSalarioComissao() {
		return valorComissao;
	}

	/**
	 * @param salarioComissao the salarioComissao to set
	 */
	public void setSalarioComissao(Double salarioComissao) {
		this.valorComissao = salarioComissao;
	}

	/**
	 * @return the fixo
	 */
	public Double getFixo() {
		return fixo;
	}

	/**
	 * @param fixo the fixo to set
	 */
	public void setFixo(Double fixo) {
		this.fixo = fixo;
	}
	
	@Override
	public Double getValorAPagar() {
		return this.valorComissao + this.fixo;
	}
	

}
