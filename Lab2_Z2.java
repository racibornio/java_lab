package pl.patryk.jipp.lab.lab2;

public class Lab2_Z2 {

    public static void main(String[] args) {
        Lab2_Z2_definitions lab2_z2_definitions = new Lab2_Z2_definitions();
        System.out.println("Możesz wyliczyć długość dla 2-, 3-, 4- i 5-elementowych wektorów.");
        lab2_z2_definitions.dlugosc_wektora(24, 89);
        lab2_z2_definitions.dlugosc_wektora(3, 33, 3);
        lab2_z2_definitions.dlugosc_wektora(1, 11, 21, 22);
        lab2_z2_definitions.dlugosc_wektora(3, 4, 3, 2, 1);
    }
}
