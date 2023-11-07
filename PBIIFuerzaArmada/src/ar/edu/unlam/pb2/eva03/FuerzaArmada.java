package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<>();
		this.batallas = new HashMap<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Vehiculo buscarVehiculo(Integer codigoVehiculo) throws VehiculoInexistente {
		for (Vehiculo vehiculo : convoy) {
			if (vehiculo.getCodigo().equals(codigoVehiculo))
				return vehiculo;
		}
		throw new VehiculoInexistente("No existe el vehiculo");
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipoDeBatalla, Double latitud, Double longitud) {
		Batalla batalla = new Batalla(nombre, tipoDeBatalla, latitud, longitud);
		batallas.put(nombre, batalla);
	}

	public Batalla getBatalla(String nombre) throws BatallaInexistente {
		for (Map.Entry<String, Batalla> entry : batallas.entrySet()) {
			String key = entry.getKey();
			Batalla val = entry.getValue();
			if (key.equals(nombre))
				return val;
		}
		throw new BatallaInexistente("No existe la batalla");
	}

	public void presentarBatalla() {
		// TODO Auto-generated method stub

	}

	public void vehiculoCompatible(String nombreBatalla, Vehiculo vehiculo) throws BatallaInexistente, VehiculoIncompatible {
		Batalla batalla = getBatalla(nombreBatalla);
		if ((vehiculo instanceof Volador && batalla.getTipoDeBatalla().equals(TipoDeBatalla.AEREO))
				|| (vehiculo instanceof Terrestre && batalla.getTipoDeBatalla().equals(TipoDeBatalla.TERRESTRE))
				|| (vehiculo instanceof Acuatico && batalla.getTipoDeBatalla().equals(TipoDeBatalla.NAVAL))) {
			
		}else {
			throw new VehiculoIncompatible("vehiculo incompatible");
		}
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer codigoVehiculo)
			throws VehiculoInexistente, BatallaInexistente, VehiculoIncompatible {
		Batalla batalla = getBatalla(nombreBatalla);
		Vehiculo vehiculo = buscarVehiculo(codigoVehiculo);
		vehiculoCompatible(nombreBatalla,vehiculo);
		return batalla.agregarVehiculo(vehiculo);
	}

}
