package AbstractFactory;

public abstract class CarFactory {
	protected Car car;
	protected int numOfCars;
	
	public CarFactory() {
	}
	
	public String beginConstruction() {
		return "The factory in "+car.locationConstruction+" starts constructing "+numOfCars+" "+car.carType+" cars.";
	}
}
