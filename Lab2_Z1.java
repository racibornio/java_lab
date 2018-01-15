package pl.patryk.jipp.lab.lab2;

public class Lab2_Z1 {
    public static void main(String[] args) {
        Lab2_Z1_constructors a = new Lab2_Z1_constructors();
        System.out.println("Action failure; hands: " + a.hands + ", head: " + a.head + ", legs: " + a.legs);
        Lab2_Z1_constructors man = new Lab2_Z1_constructors(true, true, true);
        System.out.println("Your man legs are " + man.legs + ", hands are " + man.hands + " and head is " + man.head);
    }
}
