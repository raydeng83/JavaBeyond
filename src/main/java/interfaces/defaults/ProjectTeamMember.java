package interfaces.defaults;

/**
 * Created by z00382545 on 11/5/16.
 */
public class ProjectTeamMember implements Project, TeamMember {
    private String firstName;
    private String lastName;

    @Override
    public String getName() {
        return String.format("%s working for %s",
                TeamMember.super.getName(), TeamMember.super.getName());
    }

    @Override
    public String getFirst() {
        return firstName;
    }

    @Override
    public String getLast() {
        return lastName;
    }
}
