package oop;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class HRExample {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.add(new Developer("JAdams"));
        hr.add(new Manager("BFranklin"));
        hr.add(new Developer());
        hr.add(new Manager());
        hr.listAllMembers();
        hr.payAllMembers();
    }
}
