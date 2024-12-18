package transaction.poc.config.configException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotExistException extends RuntimeException {
    public NotExistException(String message) {
        super(message);
    }
}
