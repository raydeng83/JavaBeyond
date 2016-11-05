package generics.drivable;

import java.util.Arrays;

/**
 * Created by z00382545 on 11/5/16.
 */
public class DriveShowExample {
    public static void main(String[] args) {
        DrivingShow.driveAll(Arrays.asList(new Car(), new Motorcycle(), new Truck()));
    }
}
