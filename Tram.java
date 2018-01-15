package pl.patryk.jipp.lab.lab2;

public class Tram {
    Driver driver;
    int lineNumber;
    int cabinsNumber;

    public Tram(int lineNumber, int cabinsNumber) {
        this.driver = new Driver();
        driver.setName("Mike");
        driver.setFamilyName("Wazovsky");
        driver.setContract(true);
        driver.setPermissionValid(true);
        this.lineNumber = lineNumber;
        this.cabinsNumber = cabinsNumber;
    }

    boolean isPermissionValid() {
        return driver.getPermissionsValid();
    }

}
