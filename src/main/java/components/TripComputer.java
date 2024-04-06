package components;

import cars.Car;

/**
 * Apenas mais uma característica de um carro.
 */
public class TripComputer {

    private Car car; // Referência ao carro ao qual este trip computer está associado

    /**
     * Define o carro ao qual este trip computer está associado.
     * @param car O carro ao qual este trip computer será associado.
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Mostra o nível de combustível do carro associado.
     */
    public void showFuelLevel() {
        System.out.println("Nível de combustível: " + car.getFuel());
    }

    /**
     * Mostra o estado do carro associado (se está ligado ou desligado).
     */
    public void showStatus() {
        if (this.car.getEngine().isStarted()) { // Verifica se o motor do carro está ligado
            System.out.println("Carro está ligado");
        } else {
            System.out.println("Carro não está ligado");
        }
    }
}
