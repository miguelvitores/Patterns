package Composite;

import java.util.ArrayList;
import java.util.Random;

public class MotorGasolina implements Componente{
	private ArrayList<Componente> componentes;
	private int numSerie;
	
	public MotorGasolina() {
		componentes = new ArrayList<Componente>();
		numSerie = Math.abs( new Random().nextInt() );
	}

	@Override
	public void agregarComponente(Componente c) {
		componentes.add(c);
	}

	@Override
	public void eliminarComponente(Componente c) {
		componentes.remove(c);
	}

	@Override
	public String descripcionComponente() {
		String descripcion = "Motor de gasolina con número de serie: "+numSerie;
		if(componentes.size()>0) {
			descripcion = descripcion.concat(" y está compuesto por:[");
			for(Componente c : componentes) {
				descripcion = descripcion.concat("\n\t"+c.descripcionComponente());
			}
		}
		descripcion = descripcion.concat("]\n");
		return descripcion;
	}

}
