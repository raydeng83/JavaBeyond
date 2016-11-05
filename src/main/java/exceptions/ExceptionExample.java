package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by z00382545 on 11/5/16.
 */
public class ExceptionExample {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        double z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("Finally will be called in all cases");
        }

        System.out.printf("x = %d, y = %d, z = %s%n", x, y, z);

        try {
            ExceptionExample.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Path dir = Paths.get("src", "main", "java", "exceptions");
        try (BufferedReader br = Files.newBufferedReader(dir.resolve("ExceptionExample.java"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            throw new MyException();
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }

    }
}
