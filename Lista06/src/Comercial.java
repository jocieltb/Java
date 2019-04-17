/**
 * Class que representa um contato comercial
 * @author 1829799
 *
 */
public class Comercial extends Contato{
	
	private String empresa;

	public Comercial(int codigo, String nome, String telefone, String empresa) {
		super(codigo, nome, telefone);
		
		this.setEmpresa(empresa);
		
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		
		return super.toString()	+ "\nCelular: " + this.empresa;
	}
	
}
