package innerclasses;

/**
 * Created by z00382545 on 11/10/16.
 */
public class InnerClassExample {
    public static void main(String[] args) {
        new OuterClass().new InnerClass().myMethod(); // inner instance of outer
        new OuterClass.InnerStaticClass().myMethod(); // static inner class
    }
}
