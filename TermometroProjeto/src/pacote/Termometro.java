package pacote;

public class Termometro {
	private double temperatura;
	public Termometro() {
		this.temperatura = 25.0;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double termperatura) {
		if (temperatura < -10.0 || temperatura >50.0) {
			System.out.println("Temperatura inválida! valor ignorado.");
		} else {
			this.temperatura = temperatura;
		}
	}
}
