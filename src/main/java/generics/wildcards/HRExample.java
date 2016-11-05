package generics.wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z00382545 on 11/5/16.
 */
public class HRExample {
    public static void main(String[] args) {
        List<TeamMember> teamMemberList = Arrays.asList(
                new TeamMember("member1"), new TeamMember("member2"),
                new TeamMember("member3"), new TeamMember("member4"));

        List<Developer> developerList = Arrays.asList(
                new Developer("developer1"), new Developer("developer2"),
                new Developer("developer3"), new Developer("developer4"));

        System.out.println(teamMemberList);
        System.out.println(developerList);

        HR.printTeamMemberNames(teamMemberList);
//         HR.printTeamMemberNames(developerList); // doesn't compile


        HR.printTeamMemberAndSubclassNames(developerList);

        HR.printAllFiltered(teamMemberList,
                e -> e.toString().length() % 2 == 0);
    }
}
