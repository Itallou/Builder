package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Esse � o Manual do carro.
 */
public class Manual {
    private final CarType carType; 
    private final int seats; 
    private final Engine engine; 
    private final Transmission transmission; 
    private final TripComputer tripComputer; 
    private final GPSNavigator gpsNavigator; 

    /**
     * Construtor do Manual.
     */
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType; 
        this.seats = seats; 
        this.engine = engine; 
        this.transmission = transmission; 
        this.tripComputer = tripComputer; 
        this.gpsNavigator = gpsNavigator; 
    }

    /**
     * Retorna uma representa��o textual do manual do carro.
     * @return A representa��o textual do manual do carro.
     */
    public String print() {
        String info = ""; // Inicializa uma string para armazenar as informa��es
        info += "Tipo de carro: " + carType + "\n"; 
        info += "N�mero de assentos: " + seats + "\n"; 
        info += "Motor: volume - " + engine.getVolume() + "; quilometragem - " + engine.getMileage() + "\n"; 
        info += "Transmiss�o: " + transmission + "\n"; 
        if (this.tripComputer != null) { // Verifica se h� um TripComputer definido
            info += "Computador de viagem: Funcional" + "\n"; 
        } else {
            info += "Computador de viagem: Indispon�vel" + "\n"; 
        }
        if (this.gpsNavigator != null) { // Verifica se h� um GPSNavigator definido
            info += "Navegador GPS: Funcional" + "\n"; 
        } else {
            info += "Navegador GPS: Indispon�vel" + "\n";
        }
        return info; // Retorna as informa��es completas do manual do carro
    }
}
