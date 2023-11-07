package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura = 0.0;

	public Avion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
