package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Esse é o Manual do carro.
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
     * Método para imprimir as informações do manual do carro.
     * @return contém as informações do manual.
     */
    public String print() {
        String info = ""; // Inicializa uma string para armazenar as informações
        info += "Tipo de carro: " + carType + "\n"; 
        info += "Número de assentos: " + seats + "\n"; 
        info += "Motor: volume - " + engine.getVolume() + "; quilometragem - " + engine.getMileage() + "\n";
        info += "Transmissão: " + transmission + "\n"; 
        if (this.tripComputer != null) { // Verifica se há um TripComputer definido
            info += "Computador de viagem: Funcional" + "\n"; 
        } else {
            info += "Computador de viagem: N/A" + "\n"; 
        }
        if (this.gpsNavigator != null) { // Verifica se há um GPSNavigator definido
            info += "Navegador GPS: Funcional" + "\n"; 
        } else {
            info += "Navegador GPS: N/A" + "\n"; // Adiciona informações sobre a indisponibilidade do navegador GPS
        }
        return info; // Retorna as informações completas do manual do carro
    }
}
