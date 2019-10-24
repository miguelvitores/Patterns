package Composite;

import java.util.Random;

public class Conexion implements Componente{
	private int numSerie;
	
	public Conexion() {
		numSerie = Math.abs( new Random().nextInt() );
	}

	@Override
	public void agregarComponente(Componente c) {
		System.out.println("No se pueden agregar componentes a Conexion");
	}

	@Override
	public void eliminarComponente(Componente c) {
		System.out.println("No se pueden eliminar componentes a Conexion");
	}

	@Override
	public String descripcionComponente() {
		String descripcion = "Conexion con número de serie: "+numSerie;
		descripcion = descripcion.concat("\n");
		return descripcion;
	}

}
