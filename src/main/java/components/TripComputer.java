package components;

import cars.Car;

/**
 * Apenas mais uma caracter�stica de um carro.
 */
public class TripComputer {

    private Car car; // Refer�ncia ao carro ao qual este trip computer est� associado

    /**
     * Define o carro ao qual este trip computer est� associado.
     * @param car O carro ao qual este trip computer ser� associado.
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Mostra o n�vel de combust�vel do carro associado.
     */
    public void showFuelLevel() {
        System.out.println("N�vel de combust�vel: " + car.getFuel());
    }

    /**
     * Mostra o estado do carro associado (se est� ligado ou desligado).
     */
    public void showStatus() {
        if (this.car.getEngine().isStarted()) { // Verifica se o motor do carro est� ligado
            System.out.println("Carro est� ligado");
        } else {
            System.out.println("Carro n�o est� ligado");
        }
    }
}
