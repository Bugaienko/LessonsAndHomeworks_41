package homework_24.ps2;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class ElectronicWallet extends VusaMember implements PaymentSystem{

    private String walletTitle;

    private double balance;

    public ElectronicWallet(double balance, String walletTitle) {
        super("BTC");
        this.walletTitle = walletTitle;
        this.balance = balance;
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance) {
            System.out.printf("Недостаточно средств: (am: %.2f | bal: %.2f)\n", amountBtc, balance);
            return false;
        }
        if (recipient.getCurrency().equals("BTC")) {
            recipient.depositTransfer(amountBtc);
            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %s \n", amountBtc, walletTitle, recipient.getTitle());
            balance -= amountBtc;
            return true;
        } else if (recipient.getCurrency().equals("EUR")) {
            // получаем кол-во в BTC
            double amountTransferEur = amountBtc * getCourseBTC();
            recipient.depositTransfer(amountTransferEur);

            System.out.printf("Успех! Перевод %.2f BTC (%s) -> %.2f EUR (%s) \n", amountBtc, walletTitle, amountTransferEur, recipient.getTitle());
            balance -= amountBtc;
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
        System.out.println("Успешно снято со счета " + drawMoney + " BTC");
        return true;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void depositTransfer(double amountBtc) {
        balance += amountBtc;
    }

    @Override
    public String getTitle() {
        return walletTitle;
    }

    public String getWalletTitle() {
        return walletTitle;
    }

    public void setWalletTitle(String walletTitle) {
        this.walletTitle = walletTitle;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "ElectronicWallet {" +
                // String.format("%.5f", balance) - формирование форматированной строки
                "balance=" + String.format("%.4f", balance)  + " BTC" +
                ", walletTitle='" + walletTitle + '\'' +
                '}';
    }
}
