package Game;

import java.util.concurrent.ThreadLocalRandom;

/*
 *   Класс Mage (наследует Character)
 *       Переопределите attack(): "Огненный шар!".
 *       Добавьте метод heal(), восстанавливающий здоровье.
 */
public class Wizard extends Character {
    public Wizard(String name, int health) {
        super(name, health);
    }

    /**
     * Атака фаерболом.
     * 8d6
     */
    @Override
    public int attack() {
        System.out.println("Огненный шар!");
        return ThreadLocalRandom.current().nextInt(8, 64);
    }

    /**
     * подлечимся.
     * 2d6
     */
    public void heal() {
        this.health += ThreadLocalRandom.current().nextInt(2, 12);
    }

}
