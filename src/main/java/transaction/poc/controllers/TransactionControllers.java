package transaction.poc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping()
public class TransactionControllers {


    @GetMapping
    public ResponseEntity<String> verifTransaction() {
        return new ResponseEntity<>("Success transaction config",HttpStatus.OK);
    }




}
