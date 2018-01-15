package pl.patryk.jipp.lab.lab3;

public class Lab3_Z1 {
    public static void main(String[] args) {
        Lodowka l1 = new Lodowka();
        LodowkaDoZabudowy l2 = new LodowkaDoZabudowy();

        System.out.println(MontazLodowki.wystawienieZleceniaNaMontaz(l1));
        System.out.println(MontazLodowki.wystawienieZleceniaNaMontaz(l2));
    }
}
