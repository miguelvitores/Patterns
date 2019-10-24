package Observer;

public class Observador implements IObservador{
	private RedstoneLamp redstoneLamp;
	
	public Observador(RedstoneLamp redstoneLamp) {
		this.redstoneLamp = redstoneLamp;
		this.redstoneLamp.agregarObservador(this);
	}

	@Override
	public void bloqueEstadoActualizado() {
		System.out.println("El objeto id "+redstoneLamp.getId()+" observado ha pasado al estado: "+redstoneLamp.getEstado());
	}

}
