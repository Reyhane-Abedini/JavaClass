package Lecture.Transportation;

import Lecture.Transportation.FlyingDevice.Airplane;
import Lecture.Transportation.FlyingDevice.Helicopter;

public class Airport {
    private int number;
    private Airplane[] airplane;
    private Helicopter[] helicopter;
    private Parking parkings;

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public Airplane[] getAirplane() { return airplane; }

    public void setAirplane(Airplane[] airplane) { this.airplane = airplane; }

    public Helicopter[] getHelicopter() { return helicopter; }

    public void setHelicopter(Helicopter[] helicopter) { this.helicopter = helicopter; }

    public Parking getParkings() { return parkings; }

    public void setParkings(Parking parkings) { this.parkings = parkings; }

    public Airport(int number, Airplane[] airplane, Helicopter[] helicopter, Parking parkings) {
        this.number = number;
        this.airplane = airplane;
        this.helicopter = helicopter;
        this.parkings = parkings;
    }
}
