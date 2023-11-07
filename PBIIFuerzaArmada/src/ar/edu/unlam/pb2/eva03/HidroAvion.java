package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{
	
	private Double profundidad = 0.0;
	private Double altura = 0.0;

	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura =  altura;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		 this.profundidad =  profundidad;	
	}
}
