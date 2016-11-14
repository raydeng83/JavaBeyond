package innerclasses;

@FunctionalInterface
public interface SimpleFunctionalInterface {
    void method1();
    default void method2(){
        System.out.println();
    };
}
