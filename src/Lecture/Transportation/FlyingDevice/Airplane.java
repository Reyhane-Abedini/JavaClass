package Lecture.Transportation.FlyingDevice;

import Lecture.Transportation.FuelType;

public class Airplane extends FlyingDevice {
    private String airplaneNumber;
    private Status status;

    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }

    public String getAirplaneNumber() { return airplaneNumber; }

    public void setAirplaneNumber(String airplaneNumber) { this.airplaneNumber = airplaneNumber; }

    public Airplane(String brandName, FuelType fuelType, int flyNumber, String color, String airplaneNumber, Status status) {
        super(brandName, fuelType, flyNumber, color);
        this.airplaneNumber = airplaneNumber;
        this.status = status;
    }
}
