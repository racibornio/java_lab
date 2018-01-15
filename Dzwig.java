package pl.patryk.jipp.lab.lab3;

public class Dzwig implements PodnoszenieInterfejs, ObracanieInterfejs {
    public void podnos() {
        System.out.println("Dźwig podnosi rzeczy bardzo wysoko...");
    }

    public void opuszczaj() {
        System.out.println("...ale jak opuści, to gruchnie.");
    }

    public void obracaj() {
        System.out.println("Dźwig kręci się w kółko jak szalony.");
    }
}
