package model;

public class Car {
    private String manufacturer;
    private int numberWheels;
    private boolean tuev;

    public Car () {}

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public boolean isTuev() {
        return tuev;
    }

    public Car (String manufacturer, int numberWheels, boolean tuev) {
        this.manufacturer = manufacturer;
        this.numberWheels = numberWheels;
        this.tuev = tuev;
    }

    public String toString() {
        return "Manufacturer: "+manufacturer+"\nWheels: "+numberWheels+"\nTüV: "+tuev;
    }
}
