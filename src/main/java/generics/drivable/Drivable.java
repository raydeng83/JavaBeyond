package generics.drivable;

/**
 * Created by z00382545 on 11/5/16.
 */
public interface Drivable {
    default void drive() {
        System.out.println("driving " + this.getClass().getName());
    }
}
