
public class Familiar extends Contato{
	
	private String grauParentesco;
	
	public Familiar(int codigo, String nome, String telefone, String grauParentesco) {
		super(codigo, nome, telefone);
		
		this.setGrauParentesco(grauParentesco);
		
			}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

@Override
public String toString() {
	
	return super.toString() + "\nGrau de Parentesco: " + this.grauParentesco;
}	

}
