package transaction.poc.service;

import org.hibernate.SessionFactory;
import org.hibernate.engine.transaction.internal.TransactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transaction.poc.entities.Transaction;
import transaction.poc.repository.TransRepository;
import transaction.poc.transImplements.TransImplemets;

import java.util.List;
@Service
public class TransactionServ implements TransImplemets {
    @Autowired
    private TransRepository transRepository;
    @Override
    public List<Transaction> getTransactions() {
        return transRepository.findAll();
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transRepository.save(transaction);
    }

    @Override
    public Integer sumInteget(int a, int b) {
        return a+b;
    }
}
