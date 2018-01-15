package pl.patryk.jipp.lab.lab2;

import java.lang.Math;

public class Lab2_Z2_definitions {

    double dlugosc_wektora(int a, int b, int c, int d, int e) {
        double dl;
        dl = Math.sqrt(a*a + b*b + c*c + d*d + e*e);
        System.out.println("Dlugosc wektora to " + dl);
        return dl;
    }

    double dlugosc_wektora(int a, int b, int c, int d) {
        double dl;
        dl = Math.sqrt(a*a + b*b + c*c + d*d);
        System.out.println("Dlugosc wektora to " + dl);
        return dl;
    }

    double dlugosc_wektora(int a, int b, int c) {
        double dl;
        dl = Math.sqrt(a*a + b*b + c*c);
        System.out.println("Dlugosc wektora to " + dl);
        return dl;
    }

    double dlugosc_wektora(int a, int b) {
        double dl;
        dl = Math.sqrt(a*a + b*b);
        System.out.println("Dlugosc wektora to " + dl);
        return dl;
    }
}
