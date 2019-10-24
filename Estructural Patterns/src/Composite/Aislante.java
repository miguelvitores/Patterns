package Composite;

import java.util.Random;

public class Aislante implements Componente{
	private int numSerie;
	
	public Aislante() {
		numSerie = Math.abs( new Random().nextInt() );
	}

	@Override
	public void agregarComponente(Componente c) {
		System.out.println("No se pueden agregar componentes a Aislante");
	}

	@Override
	public void eliminarComponente(Componente c) {
		System.out.println("No se pueden eliminar componentes a Aislante");
	}

	@Override
	public String descripcionComponente() {
		String descripcion = "Aislante con número de serie: "+numSerie;
		descripcion = descripcion.concat("\n");
		return descripcion;
	}

}
