package transaction.poc.config.configException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomException {

    @ExceptionHandler
    public ResponseEntity<ErrorMsg> handleNotExistException(NotExistException e) {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setStatusCode(HttpStatus.NOT_FOUND.value());
        errorMsg.setMsg(e.getMessage());
        errorMsg.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(errorMsg, HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler
    public ResponseEntity<Map<String, String>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}
