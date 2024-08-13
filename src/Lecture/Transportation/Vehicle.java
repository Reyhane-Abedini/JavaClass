package Lecture.Transportation;

public class Vehicle {
    private String brandName;
    private FuelType fuelType;

    public void Starting() { System.out.println("starting"); }

    public void Moving() { System.out.println("moving"); }

    public String getBrandName() { return brandName; }

    public void setBrandName(String brandName) { this.brandName = brandName; }

    public FuelType getFuelType() { return fuelType; }

    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public Vehicle(String brandName, FuelType fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
}
