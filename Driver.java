package pl.patryk.jipp.lab.lab2;

public class Driver {

    private String name;
    private String familyName;
    private boolean Contract;
    private boolean PermissionValid;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    String getFamilyName() {
        return familyName;
    }

    void setContract(boolean contract) {
        this.Contract = contract;
    }

    boolean getContract() {
        return Contract;
    }

    void setPermissionValid(boolean permissionValid) {
        this.PermissionValid = permissionValid;
    }

    boolean getPermissionsValid() {
        return PermissionValid;
    }

}
