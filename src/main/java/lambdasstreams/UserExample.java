package lambdasstreams;

import database.jdbc.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserExample {
    private List<String> names =
            Arrays.asList("Joffrey Baratheon", "Daenerys Targaryen", "Jon Snow",
                    "Arya Stark", "Tyrion Lannister", "Margaery Tyrell");

    public List<User> createPersonList() {
        return names.stream()
                .map(name -> new User(name))
                .collect(Collectors.toList());
    }

    public User[] createPersonArray() {
        return names.stream()
                .map(User::new)
                .toArray(User[]::new);
    }

    public List<User> createPersonListUsingNew() {
        return names.stream()
                .map(User::new)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static void main(String[] args) {
        UserExample up = new UserExample();
        System.out.println(up.createPersonList());
        System.out.println(up.createPersonListUsingNew());
        Arrays.stream(up.createPersonArray())
                .forEach(System.out::println);
    }
}
