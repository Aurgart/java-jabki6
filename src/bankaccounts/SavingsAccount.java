package bankaccounts;

/* Класс SavingsAccount (наследует Account)Добавляет поле interestRate.
 *   Переопределите withdraw(): запрет на снятие больше 1000 единиц за раз.
 *   Добавьте метод applyInterest(), который начисляет проценты на баланс.
 */
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int number, double balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }

    /**
     * Снятие денег не более 1000
     *
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= 1000 && this.balance - 1000 > 0) {
            this.balance -= amount;
        }
    }

    /**
     * Начисление процентов по вкладу
     */
    public void applyInterest() {
        this.balance *= 1 + (interestRate * 0.01);
    }
}
