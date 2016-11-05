package oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class HR {
    private List<TeamMember> teamMemberList = new ArrayList<>();

    public void add(TeamMember teamMember) {
        teamMemberList.add(teamMember);
    }

    public void remove(TeamMember teamMember) {
        teamMemberList.remove(teamMember);
    }

    public void listAllMembers() {
        teamMemberList.forEach(System.out::println);
    }

    public void payAllMembers() {
        for (TeamMember t : teamMemberList) {
            System.out.printf("Paying %s %s%n", t.getName(), NumberFormat.getCurrencyInstance().format(t.getPay()));
        }
    }
}
