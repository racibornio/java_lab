package pl.patryk.jipp.lab.lab2;

public class Lab2_Z1_constructors {

    public boolean legs;
    public boolean hands;
    public boolean head;

    Lab2_Z1_constructors() {
        legs = true;
    }

    Lab2_Z1_constructors(boolean legs, boolean hands, boolean head) {
        this.legs = legs;
        this.hands = hands;
        this.head = head;
        if (this.legs && this.hands && this.head) {
            System.out.println("Now you've created a complete man.");
        } else {
            System.out.println("Your creation is not complete.");
        }
    }
}
