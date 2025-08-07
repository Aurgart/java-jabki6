package Zoo;

/*
 Класс Lion (наследует Animal)
    *       Переопределите makeSound(): "Рычание!".
    *       Добавьте метод hunt(), выводящий "Охота на антилопу".
 */
public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Рычит");
    }

    /**
     * Идет охота на волков, идет охота!
     */
    public void hunt() {
        System.out.println(" Охота на антилопу");
    }
}
