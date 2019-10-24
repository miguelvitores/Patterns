package Composite;

import java.util.Random;

public class Piston implements Componente{
	private int numSerie;
	
	public Piston() {
		numSerie = Math.abs( new Random().nextInt() );
	}

	@Override
	public void agregarComponente(Componente c) {
		System.out.println("No se pueden agregar componentes a Pist�n");
	}

	@Override
	public void eliminarComponente(Componente c) {
		System.out.println("No se pueden eliminar componentes a Pist�n");
	}

	@Override
	public String descripcionComponente() {
		String descripcion = "Pist�n con n�mero de serie: "+numSerie;
		descripcion = descripcion.concat("\n");
		return descripcion;
	}

}
