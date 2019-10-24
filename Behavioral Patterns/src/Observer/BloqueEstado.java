package Observer;

import java.util.ArrayList;

public abstract class BloqueEstado {
	private ArrayList<IObservador> observadores;
	
	public BloqueEstado() {
		observadores = new ArrayList<>();
	}
	
	public void agregarObservador(IObservador o) {
		observadores.add(o);
		notificarCambioEstado();
	}
	
	public void eliminarObservador(IObservador o) {
		observadores.remove(o);
		notificarCambioEstado();
	}
	
	public void notificarCambioEstado() {
		for(IObservador o : observadores) {
			o.bloqueEstadoActualizado();
		}
	}
}
