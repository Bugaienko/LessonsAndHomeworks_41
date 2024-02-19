package homework_24.ps2;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public interface PaymentSystem {

    boolean transferMoney(double amount, PaymentSystem recipient);
    boolean withdrawMoney(double drawMoney);
    double checkBalance();
    String getCurrency();
    void depositTransfer(double amount);
    String getTitle();

}
