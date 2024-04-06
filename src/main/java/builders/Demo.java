package builders;

import cars.Car;
import cars.Manual;
import director.Director;

/**
 * Tudo se junta aqui.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // O Diretor obt�m o objeto builder concreto do cliente
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Carro constru�do:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O Diretor pode conhecer v�rias constru��es.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual do carro constru�do:\n" + carManual.print());
    }

}
