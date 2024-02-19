package homework_24.ps2;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class BankAccount extends VusaMember implements PaymentSystem {

    private double balance;
    private String bankName;

    public BankAccount(double balance, String bankName) {
        super("EUR");
        this.balance = balance;
        this.bankName = bankName;
    }

    @Override
    public boolean transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > balance) {
            System.out.printf("Недостаточно средств: (am: %.2f | bal: %.2f)\n", amountEur, balance);
            return false;
        }
        if (recipient.getCurrency().equals("EUR")) {
            recipient.depositTransfer(amountEur);
            System.out.printf("Успех! Перевод %.2f EUR (%s) -> %s \n", amountEur, bankName, recipient.getTitle());
            balance -= amountEur;
            return true;
        } else if (recipient.getCurrency().equals("BTC")) {
            // получаем кол-во в BTC
            double amountTransferBtc = amountEur / getCourseBTC();
            recipient.depositTransfer(amountTransferBtc);

            System.out.printf("Успех! Перевод %.2f EUR (%s) -> %.2f BTC (%s) \n", amountEur, bankName, amountTransferBtc, recipient.getTitle());
            balance -= amountEur;
            return true;
        }

        System.out.println("Что-то пошло не так с получателем перевода");
        return false;
    }

    @Override
    public boolean withdrawMoney(double drawMoney) {
        if (drawMoney > balance) {
            System.out.println("Недостаточно средств для вывода");
            return false;
        }
        balance -= drawMoney;
        System.out.println("Успешно снято со счета " + drawMoney + " EUR");
        return true;
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
    }

    @Override
    public String getTitle() {
        return bankName;
    }

    @Override
    public double checkBalance() {
        return balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank  {" +
                "balance=" + balance + "EUR" +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
