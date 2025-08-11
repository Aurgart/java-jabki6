package zoo;

/*
 *   Класс Parrot (наследует Animal)
 *       Переопределите makeSound(): "Попугай повторяет: Привет!".
 *       Используйте super в конструкторе для инициализации name и age.
 */
public class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Попуга повторяет: привет!");
    }
}
