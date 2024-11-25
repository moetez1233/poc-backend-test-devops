package transaction.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


}
