package Composite;

import java.util.Random;

public class Piston implements Componente{
	private int numSerie;
	
	public Piston() {
		numSerie = Math.abs( new Random().nextInt() );
	}

	@Override
	public void agregarComponente(Componente c) {
		System.out.println("No se pueden agregar componentes a Pistón");
	}

	@Override
	public void eliminarComponente(Componente c) {
		System.out.println("No se pueden eliminar componentes a Pistón");
	}

	@Override
	public String descripcionComponente() {
		String descripcion = "Pistón con número de serie: "+numSerie;
		descripcion = descripcion.concat("\n");
		return descripcion;
	}

}
