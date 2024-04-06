package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Carro é uma classe de produto.
 */
public class Car {
    private final CarType carType; 
    private final int seats;
    private final Engine engine; 
    private final Transmission transmission; 
    private final TripComputer tripComputer; 
    private final GPSNavigator gpsNavigator; 
    private double fuel = 0; // Quantidade de combustível no carro (inicializado como 0)

    /**
     * Construtor da classe Carro.
     */
    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType; 
        this.seats = seats; 
        this.engine = engine; 
        this.transmission = transmission; 
        this.tripComputer = tripComputer; 
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this); // Associa este carro ao objeto TripComputer
        }
        this.gpsNavigator = gpsNavigator; // Define o objeto GPSNavigator
    }

    // Getters e setters para os atributos do carro

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
