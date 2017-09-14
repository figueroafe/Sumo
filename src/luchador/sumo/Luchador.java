package luchador.sumo;

public class Luchador {
	private double peso;
	private double altura;

	public Luchador(double p, double a) {
		this.peso = p;
		this.altura = a;
	}

	boolean domina(Luchador l1, Luchador l2) {
		if (l1.peso > l2.peso && l1.altura > l2.altura)
			return true;
		if (l1.peso == l2.peso && l1.altura > l2.altura)
			return true;
		if (l1.peso < l2.peso && l1.altura == l2.altura)
			return true;
		return false;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
