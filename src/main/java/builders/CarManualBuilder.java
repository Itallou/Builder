package builders;

import cars.Manual;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Construir um manual do usuário para um carro, de forma especifica.
 */
public class CarManualBuilder implements Builder{
    private CarType type; 
    private int seats;
    private Engine engine; 
    private Transmission transmission; 
    private TripComputer tripComputer; 
    private GPSNavigator gpsNavigator;
    
    // Definições
    @Override
    public void setCarType(CarType type) {
        this.type = type; 
    }

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
     * Método para obter o resultado da construção do manual do carro.
     * O @return construi.
     */
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator); // Retorna o manual do carro construído
    }
}
