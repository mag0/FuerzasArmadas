package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	
	private Double latitud;
	private Double longitud;
	private Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	private TipoDeBatalla tipoDeBatalla;
	
	public Batalla(String nombre, TipoDeBatalla tipoDeBatalla, Double latitud,
			Double longitud) {
		this.nombre = nombre;
		this.tipoDeBatalla = tipoDeBatalla;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new HashSet<>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoDeBatalla getTipoDeBatalla() {
		return tipoDeBatalla;
	}

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculosEnLaBatalla.add(vehiculo);
		return true;
	}
}
