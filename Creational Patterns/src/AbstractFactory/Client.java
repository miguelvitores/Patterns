package AbstractFactory;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<CarFactory> factories = new ArrayList<>();

		factories.add( new SpainHatchbackFactory() );
		factories.add( new TurkeySuvFactory() );
		factories.add( new UsaCoupeFactory() );
		
		for(CarFactory f : factories) {
			System.out.println(f.beginConstruction());
		}
	}

}
