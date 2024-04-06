package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 *  A interface Builder define todas as possíveis maneiras de configurar um produto.
 */
public interface Builder {
    void setCarType(CarType type); 
    void setSeats(int seats); 
    void setEngine(Engine engine); 
    void setTransmission(Transmission transmission); 
    void setTripComputer(TripComputer tripComputer); 
    void setGPSNavigator(GPSNavigator gpsNavigator); 
    // Define o tipo do carro, número de assentos, motor, transmissão, computador e GPS.
}
