package DeliverySystem;

/*
 *    Класс Truck (наследует Vehicle)
 *       Переопределите deliver(), добавив текст: "Грузовик загружен. " + родительское сообщение.
 */
public class Truck extends Vehicle {

    public Truck(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    /**
     * Загружаем грузовик
     *
     * @param destination
     * @return
     */
    @Override
    public String deliver(String destination) {
        return "Грузовик загружен. " + super.deliver(destination);
    }
}
