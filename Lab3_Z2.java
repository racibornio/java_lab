package pl.patryk.jipp.lab.lab3;

public class Lab3_Z2 {
    public static void main(String[] args) {

        DeskPhone deskPhone = new DeskPhone();
        Intercom intercom = new Intercom();
        deskPhone.call();
        intercom.call();

        Dzwig dzwig = new Dzwig();
        Tokarka tokarka = new Tokarka();
        dzwig.obracaj();
        dzwig.opuszczaj();
        dzwig.podnos();
        tokarka.obracaj();
        tokarka.opuszczaj();
        tokarka.podnos();

    }
}
