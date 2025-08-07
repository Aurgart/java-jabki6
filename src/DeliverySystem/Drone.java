package DeliverySystem;

/*
 *    Класс Drone (наследует Vehicle)
 *       Переопределите deliver(), добавив: "Дрон взлетел. " + родительское сообщение.
 */
public class Drone extends Vehicle {
    public Drone(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    /**
     * отправка дрона
     *
     * @param destination
     * @return
     */
    @Override
    public String deliver(String destination) {
        return "Дрон взлетел. " + super.deliver(destination);
    }
}
