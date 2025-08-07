import Bank_accounts.Account;
import Bank_accounts.CreditAccount;
import Bank_accounts.SavingsAccount;
import DeliverySystem.Drone;
import DeliverySystem.Truck;
import DeliverySystem.Vehicle;
import Game.Warrior;
import Game.Wizard;
import Zoo.Animal;
import Zoo.Lion;
import Zoo.Parrot;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.synth.SynthTreeUI;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Cамостоятельная работа:
 *
 *   Задание:Создайте массив Account[] accounts с объектами SavingsAccount и CreditAccount.
 *   Продемонстрируйте полиморфизм: вызовите withdraw() и displayInfo() для всех элементов массива.
 *
 *
 * 2. Система доставки
 *    Задание:Создайте метод startDelivery(Vehicle vehicle, String address), вызывающий deliver().
 *  Продемонстрируйте работу с объектами Truck и Drone через этот метод.
 *
 * 3. Зоопарк
 *  Задание:Создайте вольер (List<Animal>) с разными животными.Вызовите makeSound() для всех, игнорируя конкретные типы.
 *
 * 4. Игровые персонажи

 *  Задание:Создайте бой между Warrior и Mage через вызовы attack() и takeDamage().
 * */
class MainTest {

    @Test
    public void testAccounts() {
        Account[] accounts = {new SavingsAccount(146, 1500.50, 11.5), new CreditAccount(130, 5000, -500), new SavingsAccount(128, 100.5, 22.2)};
        // 0
        accounts[0].displayInfo();
        accounts[0].withdraw(300);
        accounts[0].displayInfo();
        // 1
        accounts[1].displayInfo();
        accounts[1].withdraw(5300);
        accounts[1].displayInfo();
        // 2
        accounts[2].displayInfo();
        accounts[2].withdraw(110);
        accounts[2].displayInfo();
    }

    public String startDelivery(Vehicle vehicle, String address) {
        return vehicle.deliver(address);
    }

    @Test
    public void testDelivery() {
        System.out.println(startDelivery(new Truck(100, 2000), "Марс"));
        System.out.println(startDelivery(new Drone(200, 10), "Набережные Челны"));
    }

    @Test
    public void testZoo() {
        List<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Lion("Leo", 20));
        zoo.add(new Parrot("Popka", 50));
        zoo.add(new Lion("Simba", 5));
        zoo.add(new Parrot("Kesha", 30));

        for (Animal beast : zoo) {
            beast.makeSound();
            beast.eat();
        }
    }

    @Test
    public void testGame() {
        Warrior warrior = new Warrior("Tavros", 85);
        Wizard wizard = new Wizard("Starper", 45);

        wizard.takeDamage(warrior.attack());
        wizard.displayStats();
        wizard.heal();
        wizard.displayStats();

        warrior.takeDamage(wizard.attack() - warrior.block());
        warrior.displayStats();
    }
}