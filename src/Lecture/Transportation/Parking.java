package Lecture.Transportation;

public class Parking {
    private int parkNumber;
    private Car[] car;

    public int getParkNumber() { return parkNumber; }

    public void setParkNumber(int parkNumber) { this.parkNumber = parkNumber; }

    public Car[] getCar() { return car; }

    public void setCar(Car[] car) { this.car = car; }

    public Parking(int parkNumber, Car[] car) {
        this.parkNumber = parkNumber;
        this.car = car;
    }
}
