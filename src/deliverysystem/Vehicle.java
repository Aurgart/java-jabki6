package deliverysystem;

/*
 *    Базовый класс Vehicle с полями: maxSpeed, cargoCapacity.
 *    Метод deliver(String destination) выводит: "Доставка в [destination]".
 */
public class Vehicle {
    private int maxSpeed;
    private int cargoCapacity;

    public Vehicle(int maxSpeed, int cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Доставка в точку
     *
     * @param destination
     */
    public String deliver(String destination) {
        return "Доставляем в " + destination;
    }
}
