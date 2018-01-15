package pl.patryk.jipp.lab.lab3;

public class Tokarka implements PodnoszenieInterfejs, ObracanieInterfejs {
    public void podnos(){
        System.out.println("Tokarka nie może nic podnieść.");
    }

    public void opuszczaj() {
        System.out.println("Tokarka nie może nic opuścić.");
    }

    public void obracaj() {
        System.out.println("Tokarka nie może się obracać.");
    }
}
