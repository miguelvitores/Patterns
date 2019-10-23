package AbstractFactory;

public class UsaCoupeFactory extends CarFactory{

	public UsaCoupeFactory() {
		super.car = new CoupeCar(LocationConstruction.USA);
		super.numOfCars = 75;
	}
	
}
