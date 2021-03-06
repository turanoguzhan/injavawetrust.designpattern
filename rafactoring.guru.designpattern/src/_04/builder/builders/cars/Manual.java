package _04.builder.builders.cars;

import _04.builder.builders.components.Engine;
import _04.builder.builders.components.GPSNavigator;
import _04.builder.builders.components.Transmission;
import _04.builder.builders.components.TripComputer;

public class Manual {
	private final Type type;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;

	public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		this.type = type;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.gpsNavigator = gpsNavigator;
	}

	public String print() {
		StringBuilder info = new StringBuilder();
		info.append("Type of car: " + type + "\n");
		info.append("Count of seats: " + seats + "\n");
		info.append("Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n");
		info.append("Transmission: " + transmission + "\n");
		info.append("Trip Computer: Trip Computer" + "\n");
		info.append("GPS Navigator: GPS Navigator" + "\n");
		return info.toString();
	}
}