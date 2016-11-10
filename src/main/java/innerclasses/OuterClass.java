package innerclasses;

/**
 * Created by z00382545 on 11/10/16.
 */
public class OuterClass {
    private int anInt;
    private String string;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public class InnerClass {
        public void myMethod() {
            System.out.println("anInt=" + anInt + ", string=" + string);
        }
    }

    public static class InnerStaticClass {
        public void myMethod() {
            System.out.println("inside a static inner class");
        }
    }
}
