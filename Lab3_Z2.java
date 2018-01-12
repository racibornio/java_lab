package pl.patryk.jipp.lab.lab3;

public class Lab3_Z2 {
    public static void main(String[] args) {
        DobreDziecko dobreDziecko = new DobreDziecko();
        NiedobreDziecko niedobreDziecko = new NiedobreDziecko();
        dobreDziecko.zachowujSie();
        niedobreDziecko.zachowujSie();

        ZachowanieDobre zachowanieDobre = new ZachowanieDobre();
        ZachowanieNiedobre zachowanieNiedobre = new ZachowanieNiedobre();
        zachowanieDobre.zachowujSie();
        zachowanieDobre.rysuj();
        zachowanieNiedobre.zachowujSie();
        zachowanieNiedobre.rysuj();
        ZachowanieInterfejs dobreZ = new ZachowanieDobre();
        dobreZ.zachowujSie();
        RysujInterfejs dobreR = new ZachowanieDobre();
        dobreR.rysuj();
    }
}
