package transaction.poc.config.configException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

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

}
