package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad = 0.0;
	
	public Camion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
