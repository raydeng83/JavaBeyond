package generics.wildcards;

import java.time.LocalDate;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class TeamMember {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("TeamMember {name='%s'}", name);
    }
}
