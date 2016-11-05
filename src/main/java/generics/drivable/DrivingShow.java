package generics.drivable;

import java.util.List;

/**
 * Created by z00382545 on 11/5/16.
 */
public class DrivingShow {
    public static <T extends Drivable> void driveAll(List<T> items) {
        items.forEach(T::drive);
    }
}
