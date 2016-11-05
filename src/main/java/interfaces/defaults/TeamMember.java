package interfaces.defaults;

/**
 * Created by z00382545 on 11/5/16.
 */
public interface TeamMember {
    String getFirst();
    String getLast();

    default String getName() {
        return String.format("%s %s", getFirst(), getLast());
    }
}
