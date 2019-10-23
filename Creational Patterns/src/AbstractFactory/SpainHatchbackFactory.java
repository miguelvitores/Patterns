package AbstractFactory;

public class SpainHatchbackFactory extends CarFactory{

	public SpainHatchbackFactory() {
		super.car = new HatchbackCar(LocationConstruction.SPAIN);
		super.numOfCars = 15;
	}
}
