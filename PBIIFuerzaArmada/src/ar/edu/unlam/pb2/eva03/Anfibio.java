package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {

	private Double profundidad = 0.0;
	private Double velocidad = 0.0;

	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;

	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

}
