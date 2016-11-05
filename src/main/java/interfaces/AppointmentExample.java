package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by z00382545 on 11/5/16.
 */
public class AppointmentExample {
    public static void main(String[] args) {
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(1, "Saturn", 4));
        appointments.add(new Appointment(2, "Jupiter", 2));
        appointments.add(new Appointment(3, "Mercury", 1));
        appointments.add(new Appointment(4, "Neptune", 4));
        appointments.add(new Appointment(5, "Venus", 3));

        appointments.forEach(System.out::println);

        Collections.sort(appointments);
        System.out.println("After natural sort:");
        appointments.forEach(System.out::println);
    }
}
