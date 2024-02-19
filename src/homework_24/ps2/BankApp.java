package homework_24.ps2;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class BankApp {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(25000, "Cyprus Bank");
        BankAccount bank2 = new BankAccount(100_000, "Bank Alpha");

        System.out.println(bank1);
        System.out.println(bank2);

        bank1.transferMoney(50000, bank2);

        bank2.transferMoney(50000, bank1);
        System.out.println(bank2);
        System.out.println(bank1);

        ElectronicWallet wallet = new ElectronicWallet(5, "Crypto wallet");
        System.out.println("\n==================\n");

        wallet.transferMoney(1, bank1);
        System.out.println(wallet);
        System.out.println(bank1);

        bank1.transferMoney(65000, wallet);
        System.out.println(wallet);
        System.out.println(bank1);


    }
}
