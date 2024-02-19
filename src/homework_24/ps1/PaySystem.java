package homework_24.ps1;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

/*
Платежные системы
Создайте интерфейс PaymentSystem с методами transferMoney, withdrawMoney и checkBalance.

Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.

Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public interface PaySystem {

    void transferMoney(double amount);
    void withdrawMoney(double drawMoney);

    double checkBalance();


}
