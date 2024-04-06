package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 *  A interface Builder define todas as poss�veis maneiras de configurar um produto.
 */
public interface Builder {
    void setCarType(CarType type); 
    void setSeats(int seats); 
    void setEngine(Engine engine); 
    void setTransmission(Transmission transmission); 
    void setTripComputer(TripComputer tripComputer); 
    void setGPSNavigator(GPSNavigator gpsNavigator); 
    // Define o tipo do carro, n�mero de assentos, motor, transmiss�o, computador e GPS.
}
