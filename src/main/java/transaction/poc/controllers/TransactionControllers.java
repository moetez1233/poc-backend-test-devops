package transaction.poc.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import transaction.poc.entities.Transaction;
import transaction.poc.transImplements.TransImplemets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Transaction> createTransaction(@Valid @RequestBody Transaction transaction) {
        return new ResponseEntity<>(transImplemets.addTransaction(transaction), HttpStatus.CREATED);
    }

}
