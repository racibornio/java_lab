package pl.patryk.jipp.lab.lab3;

public class ZachowanieNiedobre implements ZachowanieInterfejs, RysujInterfejs {

    public void zachowujSie() {
        System.out.println("To jest zachowanie niedobre.");
    }

    public void rysuj() {
        System.out.println("Rysuję bazgroły a potem rzucam w ścianę.");
    }
}
