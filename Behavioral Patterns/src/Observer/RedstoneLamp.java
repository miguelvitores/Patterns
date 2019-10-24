package Observer;

import java.util.Random;

public class RedstoneLamp extends BloqueEstado{
	private int estado;
	private int id;
	
	public RedstoneLamp() {
		estado = 0;
		id = new Random().nextInt(100);
	}
	
	public String getEstado() {
		if(estado==0){
			return "APAGADO";
		}else {
			return "ENCENDIDO";
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void cambiarEstado() {
		if(estado==0) {
			estado = 1;
		}else{
			estado = 0;
		}
		notificarCambioEstado();
	}
}
