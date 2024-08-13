package Lecture.Transportation.FlyingDevice;

import Lecture.Transportation.FuelType;

public class Helicopter extends FlyingDevice {
    private String helicopterNumber;

    public String getHelicopterNumber() { return helicopterNumber; }

    public void setHelicopterNumber(String helicopterNumber) { this.helicopterNumber = helicopterNumber; }

    public void VerticalFlight(){ System.out.println("verticalFlight"); }

    public Helicopter(String brandName, FuelType fuelType, int flyNumber, String color, String helicopterNumber) {
        super(brandName, fuelType, flyNumber, color);
        this.helicopterNumber = helicopterNumber;
    }
}
