package Lecture.Transportation.FlyingDevice;

import Lecture.Transportation.FuelType;
import Lecture.Transportation.Vehicle;

public class FlyingDevice extends Vehicle {
    private int FlyNumber;
    private String Color;

    public int getFlyNumber() { return FlyNumber; }

    public void setFlyNumber(int flyNumber) { FlyNumber = flyNumber; }

    public String getColor() { return Color; }

    public void setColor(String color) { Color = color; }

    public void TakeOff(){ System.out.println("TakingOff AirPlane"); }

    public void TakeOn(){ System.out.println("TakingOn AirPlane"); }

    public FlyingDevice(String brandName, FuelType fuelType, int flyNumber, String color) {
        super(brandName, fuelType);
        FlyNumber = flyNumber;
        Color = color;
    }
}
