package components;

/**
 * Apenas mais uma característica de um carro.
 */
public class GPSNavigator {
    private String route; // A rota definida pelo navegador GPS

    /**
     * Construtor padrão que define uma rota padrão.
     */
    public GPSNavigator() {
        this.route = "221b, Baker Street, London to Scotland Yard, 8-10 Broadway, London";
    }

    /**
     * Construtor que permite definir uma rota manualmente.
     * @param manualRoute A rota a ser definida manualmente.
     */
    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    /**
     * Retorna a rota definida pelo navegador GPS.
     * @return A rota definida pelo navegador GPS.
     */
    public String getRoute() {
        return route;
    }
}
