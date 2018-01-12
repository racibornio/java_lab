package pl.patryk.jipp.lab.lab3;

public class ZachowanieDobre implements ZachowanieInterfejs, RysujInterfejs {

    public void zachowujSie() {
        System.out.println("To jest dobre zachowanie.");
    }

    public void rysuj() {
        System.out.println("Daję mamie ładny rysunek.");
    }
}
