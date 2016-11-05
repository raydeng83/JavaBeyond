package exceptions;

/**
 * Created by z00382545 on 11/5/16.
 */
public class MyException extends Exception{
    public MyException() {
        this("default exception message");
    }

    public MyException(String message) {
        super(message);
    }
}
