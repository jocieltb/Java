package Exercico02;

/**
 * Representa um ponto no plano cartesiano.
 * @author 1829799
 *
 */
public class Ponto {

	private Double x;
	
	private Double y;
	
	public Ponto() {
		// Vásio
		
	}
	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	/**
	 * Calcula a distancia do ponto atual até as coordenadas informadas.
	 * @param x 
	 * @param y
	 * @return a distância
	 */
	public Double distancia(Double x, Double y) {
		
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		
	}
	
	public Double distancia(Ponto ponto) {
		
		return distancia(ponto.getX(), ponto.getY());
		
	}
	

}
