package game;

import java.util.concurrent.ThreadLocalRandom;

/*
  Базовый класс Character с полями: name, health.
    *   Методы:- attack(): "Атакую!",- takeDamage(int damage): уменьшает health.
 */
public class Character {

    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /**
     * атака
     * 1d8
     */
    public int attack() {
        System.out.println("Атакую!");
        return ThreadLocalRandom.current().nextInt(1, 8);
    }

    /**
     * получение урона
     *
     * @param damage
     */
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            System.out.println("дал дуба!");
        }
    }

    /**
     * вывод здоровья
     */
    public void displayStats() {
        System.out.println(this.name + " hp: " + this.health);
    }
}
