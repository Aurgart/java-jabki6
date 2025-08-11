package bankaccounts;

public class Account {
    double balance;
    /*Базовый класс Account с полями: accountNumber, balance.
     *   Методы:- deposit(double amount) (пополнение),- withdraw(double amount) (снятие, не может уйти в минус),- displayInfo() (выводит номер счета и баланс).*/
    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(int number, double balance) {
        this.accountNumber = number;
        this.balance = balance;
    }

    /**
     * Докидываем бабосики
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Опусташаем лопатник
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount > 0) {
            balance -= amount;
        }
    }

    /**
     * кто богатенький?
     */
    public void displayInfo() {
        System.out.println("Номер: " + this.accountNumber + " Баланс: " + this.balance);
    }
}
