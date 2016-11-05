package generics.wildcards;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class HR {
    public static void printTeamMemberNames(List<TeamMember> TeamMembers) {
        TeamMembers.stream()
                .map(TeamMember::getName)
                .forEach(System.out::println);
    }

    public static void printTeamMemberAndSubclassNames(List<? extends TeamMember> TeamMembers) {
        TeamMembers.stream()
                .map(TeamMember::getName)
                .forEach(System.out::println);
        // TeamMembers.add(new TeamMember("Fred")); // does not compile
        // TeamMembers.add(new Developer("Barney")); // does not compile
    }

    public static void printAllFiltered(
            List<? extends TeamMember> TeamMembers, Predicate<? super TeamMember> predicate) {
        for (TeamMember e : TeamMembers) {
            if (predicate.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}
