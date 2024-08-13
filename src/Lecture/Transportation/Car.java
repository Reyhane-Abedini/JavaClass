package Lecture.Transportation;

public class Car extends Vehicle {
    private String carNumber;
    private BodyType bodyType;

    public BodyType getBodyType() { return bodyType; }

    public void setBodyType(BodyType bodyType) { this.bodyType = bodyType; }

    public String getCarNumber() { return carNumber; }

    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }

    public Car(String brandName, FuelType fuelType, String carNumber, BodyType bodyType) {
        super(brandName, fuelType);
        this.carNumber = carNumber;
        this.bodyType = bodyType;
    }
}
