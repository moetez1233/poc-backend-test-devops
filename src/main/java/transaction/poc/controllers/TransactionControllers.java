package transaction.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import transaction.poc.entities.Transaction;
import transaction.poc.transImplements.TransImplemets;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionControllers {
    @Autowired
    private TransImplemets transImplemets;

    @GetMapping
    public ResponseEntity<String> verifTransaction() {
        return new ResponseEntity<>("Success transaction config",HttpStatus.OK);
    }

    @GetMapping("/listTransaction")
    private ResponseEntity<List<Transaction>> getTransactions() {
        return new ResponseEntity<>(transImplemets.getTransactions(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransaction(@PathVariable int id) {
        return new ResponseEntity<>(transImplemets.getTransaction(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transImplemets.addTransaction(transaction), HttpStatus.CREATED);
    }


}
