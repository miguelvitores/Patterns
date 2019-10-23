package AbstractFactory;

public abstract class Car {
	protected CarType carType;
	protected LocationConstruction locationConstruction;
	
	public Car(CarType carType, LocationConstruction locationConstruction) {
		this.carType = carType;
		this.locationConstruction = locationConstruction;
	}
}
