package transaction.poc.transImplements;

import transaction.poc.entities.Transaction;

import java.util.List;

public interface TransImplemets {
List<Transaction> getTransactions();
Transaction addTransaction(Transaction transaction);
    Integer sumInteget(int a ,int b);
}
