package Observer;

public class Cliente {

	public static void main(String[] args) {

		RedstoneLamp rl1 = new RedstoneLamp();
		RedstoneLamp rl2 = new RedstoneLamp();
		
		IObservador obs1 = new Observador(rl1);
		IObservador obs2 = new Observador(rl2);
		
		rl1.cambiarEstado();
		rl1.cambiarEstado();
		rl2.cambiarEstado();
		rl1.cambiarEstado();
		rl2.cambiarEstado();
		
	}

}
