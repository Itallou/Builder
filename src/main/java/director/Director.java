package director;

import builders.Builder;
import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * O Director define a ordem dos passos de constru��o. 
 */
public class Director {

    /**
     * Constr�i um carro esportivo usando o builder fornecido.
     */
    public void constructSportsCar(Builder builder) {
        // Define o tipo de carro como SPORTS_CAR
        builder.setCarType(CarType.SPORTS_CAR);
        // Define o n�mero de assentos como 2
        builder.setSeats(2);
        // Define o motor como um motor de 3.0 litros
        builder.setEngine(new Engine(3.0, 0));
        // Define a transmiss�o como SEMI_AUTOMATIC
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        // Define o computador de viagem
        builder.setTripComputer(new TripComputer());
        // Define o navegador GPS
        builder.setGPSNavigator(new GPSNavigator());
    }

    /**
     * Constr�i um carro urbano usando o builder fornecido.
     * @param builder O objeto builder a ser usado para a constru��o.
     */
    public void constructCityCar(Builder builder) {
        // Define o tipo de carro como CITY_CAR
        builder.setCarType(CarType.CITY_CAR);
        // Define o n�mero de assentos como 2
        builder.setSeats(2);
        // Define o motor como um motor de 1.2 litros
        builder.setEngine(new Engine(1.2, 0));
        // Define a transmiss�o como AUTOMATIC
        builder.setTransmission(Transmission.AUTOMATIC);
        // Define o computador de viagem
        builder.setTripComputer(new TripComputer());
        // Define o navegador GPS
        builder.setGPSNavigator(new GPSNavigator());
    }

    /**
     * Constr�i um SUV usando o builder fornecido.
     * @param builder O objeto builder a ser usado para a constru��o.
     */
    public void constructSUV(Builder builder) {
        // Define o tipo de carro como SUV
        builder.setCarType(CarType.SUV);
        // Define o n�mero de assentos como 4
        builder.setSeats(4);
        // Define o motor como um motor de 2.5 litros
        builder.setEngine(new Engine(2.5, 0));
        // Define a transmiss�o como MANUAL
        builder.setTransmission(Transmission.MANUAL);
        // Define o navegador GPS
        builder.setGPSNavigator(new GPSNavigator());
    }
}
