package homework_42;
/*
@date 15.03.2024
@author Sergey Bugaienko
*/

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HW42_Task2 {

    enum TransactionType { DEBIT, CREDIT }

    static class Transaction {
        private double amount;
        private TransactionType type;
        private LocalDateTime timestamp;

        public Transaction(double amount, TransactionType type) {
            this.amount = amount;
            this.type = type;
            this.timestamp = LocalDateTime.now();
        }

        public double getAmount() {
            return amount;
        }

        public TransactionType getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    amount +
                    ": " + type +
                    '}';
        }
    }

    /*
    Дан список транзакций (Transaction) с полями amount, type (DEBIT/CREDIT), timestamp.
    Используя Stream API, вычислите общую сумму для дебетовых и кредитных транзакций отдельно,
    а также найдите транзакцию с максимальной суммой.
     */
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>(List.of(
                new Transaction(2000, TransactionType.DEBIT),
                new Transaction(2100, TransactionType.CREDIT),
                new Transaction(2500, TransactionType.CREDIT),
                new Transaction(5000, TransactionType.DEBIT),
                new Transaction(3800, TransactionType.CREDIT),
                new Transaction(20_000, TransactionType.DEBIT),
                new Transaction(15_000, TransactionType.CREDIT)
        ));

        double sumDebit = transactions
                .stream()
                .filter(tr -> tr.getType() == TransactionType.DEBIT)
                .map(Transaction::getAmount)
                .reduce(0.0, Double::sum);

        double sumCredit = transactions
                .stream()
                .filter(tr ->  tr.getType() == TransactionType.CREDIT)
                .mapToDouble(Transaction::getAmount)
                .sum();

//        transactions = new ArrayList<>();

        Optional<Transaction> transactionMax = transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount));

        System.out.println("Сумма DEBIT транзакций: " + sumDebit);
        System.out.println("Сумма CREDIT транзакций: " + sumCredit);

        System.out.println("Транзакция с максимальной суммой: "+  ((transactionMax.isPresent()) ? transactionMax.get() : " не найдена"));






    }

}
