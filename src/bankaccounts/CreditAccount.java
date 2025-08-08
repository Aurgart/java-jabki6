package bankaccounts;

/*
 * Класс CreditAccount (наследует Account) Добавляет поле creditLimit.
 *   Переопределите withdraw(): разрешите уходить в минус до creditLimit.
 *   Используйте super для вызова родительской логики снятия.
 */
public class CreditAccount extends Account {

    double creditLimit;

    public CreditAccount(int number, double balance, double creditLimit) {
        super(number, balance);
        this.creditLimit = creditLimit;
    }

    /**
     * Опусташаем лопатник
     *
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount > creditLimit) {
            balance -= amount;
        }
    }
}
