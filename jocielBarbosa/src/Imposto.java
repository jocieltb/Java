/**
 * 
 * @author 1829799
 *
 */
public abstract class Imposto {

	private Double aliquotaFederal = 0.15;

	protected Double valor;

	public Imposto(Double valor) {

		this.valor = valor;
	}

	public Double calcularImpostoTotal() {

		return valor + calcularImpostoFederal() + calcularImpostoEstadual();

	}

	public Double calcularImpostoFederal() {
		return valor * aliquotaFederal;
	}
	
	public abstract Double calcularImpostoEstadual();
	
}
