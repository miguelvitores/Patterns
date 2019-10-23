package AbstractFactory;

public class TurkeySuvFactory extends CarFactory{

	public TurkeySuvFactory() {
		super.car = new SuvCar(LocationConstruction.TURKEY);
		super.numOfCars = 35;
	}
	
}
