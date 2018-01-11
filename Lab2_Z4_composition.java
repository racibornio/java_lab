package pl.patryk.jipp.lab.lab2;

public class Lab2_Z4_composition {
    public static void main(String[] args) {
        Tram tr1 = new Tram(11, 2);
        System.out.println("Driver permission: " + tr1.isPermissionValid() + "; driver name: " + tr1.driver.getName() + " " + tr1.driver.getFamilyName() + " and contract: " + tr1.driver.getContract());
    }
}
