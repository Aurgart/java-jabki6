package Game;

import java.util.concurrent.ThreadLocalRandom;

/*
 *   Класс Warrior (наследует Character)
 *       Переопределите attack(): "Мечом в лицо!".
 *       Добавьте метод block(), уменьшающий получаемый урон.
 */
public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    /**
     * Атака мечом.
     * 1d8 - урон меча +4 за силу (18)
     * предположим что 2 атаки в раунд т.е 10d24
     */
    @Override
    public int attack() {
        System.out.println("Мечом по харе!");
        return ThreadLocalRandom.current().nextInt(10, 24);
    }

    /**
     * Блокирование, возвращает число от 1 до 10 на которое снижает урон.
     *
     * @return
     */
    public int block() {
        return ThreadLocalRandom.current().nextInt(1, 11);
    }
}
