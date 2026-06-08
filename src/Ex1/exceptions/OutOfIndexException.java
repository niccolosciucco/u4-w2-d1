package Ex1.exceptions;

public class OutOfIndexException extends RuntimeException {
    public OutOfIndexException(String message) {
        super(message);
    }
}
