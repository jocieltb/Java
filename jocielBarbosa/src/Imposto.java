/**
 * 
 * @author 1829799
 *
 */
public abstract class Imposto {

	private Double aliquotaFederal;

	protected Double valor;

	public Imposto(Double valor) {

		this.valor = valor;
	}

	public Double calcularImpostoTotal() {

		return null;

	}

	public Double calcularImpostoFederal() {
		return null;
	}
	
	public abstract Double calcularImpostoEstadual();
	
}
