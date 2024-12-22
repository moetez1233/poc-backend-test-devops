package transaction.poc.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping
public class GaiaController {

    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
String folderPath= "src/main/resources/dropBoxLocal/"+name;
File folder = new File(folderPath);
if (!folder.exists()) {
    folder.mkdir();
}
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
