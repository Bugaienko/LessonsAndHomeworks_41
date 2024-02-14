package lesson_21;
/*
@date 13.02.2024
@author Sergey Bugaienko
*/

public class BusDriver {
    private String licenseNumber;
    private Autobus autobus; // организация двунаправленной связи

    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
