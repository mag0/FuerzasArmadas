package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico{
	
	private Double profundidad = 0.0;
	
	public Destructor(Integer codigo, String nombre) {
		super(codigo, nombre);
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
