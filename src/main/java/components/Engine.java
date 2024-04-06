package components;

/**
 * Apenas mais uma caracter�stica de um carro.
 */
public class Engine {
    private final double volume; // O volume do motor (em litros)
    private double mileage; // A quilometragem do motor
    private boolean started; // Indica se o motor est� ligado ou desligado

    /**
     * Construtor da classe Engine.
     */
    public Engine(double volume, double mileage) {
        this.volume = volume; // Define o volume do motor
        this.mileage = mileage; // Define a quilometragem do motor
    }

    /**
     * Liga o motor.
     */
    public void on() {
        started = true; // Define o motor como ligado
    }

    /**
     * Desliga o motor.
     */
    public void off() {
        started = false; // Define o motor como desligado
    }

    /**
     * Verifica se o motor est� ligado.
     * @return true se o motor est� ligado, false caso contr�rio.
     */
    public boolean isStarted() {
        return started; // Retorna o estado do motor (ligado/desligado)
    }

    /**
     * Faz o motor "andar", aumentando a quilometragem.
     * @param mileage A quilometragem a ser adicionada.
     */
    public void go(double mileage) {
        if (started) { // Verifica se o motor est� ligado
            this.mileage += mileage; // Atualiza a quilometragem
        } else {
            System.err.println("N�o � poss�vel ir(), voc� deve ligar o motor primeiro!"); // Exibe uma mensagem de erro se o motor n�o estiver ligado
        }
    }

    /**
     * Retorna o volume do motor.
     * @return O volume do motor.
     */
    public double getVolume() {
        return volume; // Retorna o volume do motor
    }

    /**
     * Retorna a quilometragem do motor.
     * @return A quilometragem do motor.
     */
    public double getMileage() {
        return mileage; // Retorna a quilometragem do motor
    }
}
