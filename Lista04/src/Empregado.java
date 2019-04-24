import java.util.Date;

/**
 * Representa um empregado
 * 
 * @author 1829799
 *
 */
public abstract class Empregado {
	
	private String nome;
	private Date dataNascimento;
	private String email;
	private String telefone;
	private Date dataContratacao;
	private Date dataDemissao;
	private String matricula;
	
	/**
	 * @param nome
	 * @param dataNascimento
	 * @param email
	 * @param telefone
	 * @param dataContratacao
	 * @param dataDemissao
	 * @param matricula
	 */
	public Empregado(String nome, Date dataNascimento, String email, String telefone, Date dataContratacao,
			Date dataDemissao, String matricula) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.dataContratacao = dataContratacao;
		this.dataDemissao = dataDemissao;
		this.matricula = matricula;
	}
	/**
	 * @return O nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the dataContratacao
	 */
	public Date getDataContratacao() {
		return dataContratacao;
	}
	/**
	 * @param dataContratacao the dataContratacao to set
	 */
	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	/**
	 * @return the dataDemissao
	 */
	public Date getDataDemissao() {
		return dataDemissao;
	}
	/**
	 * @param dataDemissao the dataDemissao to set
	 */
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Double getValorAPagar() {
		return 0d;
	}
	
	
}
