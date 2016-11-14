package innerclasses;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by z00382545 on 11/10/16.
 */
public class FileExample {
    public static void main(String[] args) {
        File dir = new File("src/main/java/innerclasses");
        for (String name : dir.list()) {
            System.out.println(name);
        }

        System.out.println("\nOnly Java files:");
        for (String name : dir.list(new JavaFilter())) {
            System.out.println(name);
        }

        System.out.println("\nUsing anonymous inner class for text files:");
        for (String name : dir.list((dir1, name1) -> name1.endsWith(".java"))) {
            System.out.println(name);
        }
    }
}
