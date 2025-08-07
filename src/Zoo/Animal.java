package Zoo;

/*
 *   Базовый класс Animal с полями: name, age.
 *   Методы:- makeSound() (выводит "Издает звук"),- eat() (выводит "[name] ест").
 */
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * издает звук
     */
    public void makeSound() {
        System.out.println("Издает животный звук");
    }

    /**
     * Ест
     */
    public void eat() {
        System.out.println(this.name + " ест");
    }

}
