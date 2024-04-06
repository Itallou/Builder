package builders;

import cars.Car;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Os builders implementam os passos definidos na interface.
 */
public class CarBuilder implements Builder {
    private CarType type; 
    private int seats; 
    private Engine engine;
    private Transmission transmission; 
    private TripComputer tripComputer; 
    private GPSNavigator gpsNavigator; 
    /* Tipo de carro, Número de assentos, engine representando o motor, tipo da transmissão
    * TripComputer representa o computador, o GPSNavigator representa o gps.
    */
    public void setCarType(CarType type) {
        this.type = type; // Define o tipo de carro
    }

    //Define tudo a cima.
    @Override
    public void setSeats(int seats) {
        this.seats = seats; 
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine; 
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission; 
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator; 
    }

    /**
     * Método para a construção do carro.
     * No @return o carro será construído.
     */
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator); // Retorna o carro construído
    }
}
