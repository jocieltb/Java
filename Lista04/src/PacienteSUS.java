
public class PacienteSUS extends Paciente {
	
	private String codigoSUS;	
	
	public PacienteSUS(String codigo, String nome,String codigoSUS) {
		super(codigo, nome);
		this.codigoSUS = codigoSUS;
	}

	

	/**
	 * @return the codigoSUS
	 */
	public String getCodigoSUS() {
		return codigoSUS;
	}

	/**
	 * @param codigoSUS the codigoSUS to set
	 */
	public void setCodigoSUS(String codigoSUS) {
		this.codigoSUS = codigoSUS;
	}
	
	
	
	

}
