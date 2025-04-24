package basic.lecture.exception0423.sec02.exception;

public class MoneyNegativeException extends Exception {

    public MoneyNegativeException() {
    }

    public MoneyNegativeException(String message) {
        super(message);
    }
}