package basic.lecture.exception0423.sec02.exception;

public class PriceNegativeException extends Exception {

    public PriceNegativeException() {
    }

    public PriceNegativeException(String message) {
        super(message);
    }
}
