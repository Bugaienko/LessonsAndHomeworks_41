package homework_24.ps1;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class EWallet  implements PaySystem{

    private String title;
    private double balance;

    public EWallet(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount > balance) return;
        System.out.println("Электронный кошелек " + title + ". Перевод " + amount);
        balance -= amount;
    }

    @Override
    public void withdrawMoney(double drawMoney) {
        if (drawMoney > balance) return;
        System.out.println("Электронный кошелек " + title + ". Вывод со счета " + drawMoney);
        balance -= drawMoney;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "EWallet{" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                '}';
    }
}
