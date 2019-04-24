import java.util.Date;

public class EmpregadoPrdutividade extends EmpregadoMensal {

	private Double produtividade;
	
	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 * @param salario
	 */
	public EmpregadoPrdutividade(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula, Double salario) {
		super(nome, dataNascimento, email, telefone, dataContratacao, dataDemissao, matricula, salario);
		
	}

	/**
	 * @return the produtividade
	 */
	public Double getProdutividade() {
		return produtividade;
	}

	/**
	 * @param produtividade the produtividade to set
	 */
	public void setProdutividade(Double produtividade) {
		this.produtividade = produtividade;
	}

}
