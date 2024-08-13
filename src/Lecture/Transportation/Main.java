package Lecture.Transportation;

import Lecture.Transportation.FlyingDevice.Airplane;
import Lecture.Transportation.FlyingDevice.Helicopter;
import Lecture.Transportation.FlyingDevice.Status;

public class Main {
    public static void main(String[] args) {

        Airplane iranAir=new Airplane("IranAir",FuelType.WhiteGasoline,8456,"White","A8866", Status.OnTime);
        Airplane mahan=new Airplane("Mahan",FuelType.Gasoline,01265,"Green","M9856", Status.Delay);
        Airplane kishAir=new Airplane("KishAir",FuelType.WhiteGasoline,98005,"White-Blue","4490R", Status.OnTime);

        Helicopter saba=new Helicopter("ArteshAir",FuelType.WhiteGasoline,870,"Yellow","IR590");
        Helicopter meghdad=new Helicopter("Sepah",FuelType.Diesel,186,"White","IR020");

        Car pride= new Car("Saypa",FuelType.Diesel,"12A56789-IR",BodyType.Sedan);
        Car BMW= new Car("BMW",FuelType.Diesel,"90B9999-UR",BodyType.Coupe);
        Car samand = new Car("IRk",FuelType.Gasoline,"76B98789-IR",BodyType.Sedan);

        Airplane[] airplanes=new Airplane[]{iranAir,mahan,kishAir};
        Helicopter[] helicopters=new Helicopter[]{saba,meghdad};
        Car[] cars=new Car[]{pride,BMW,samand};

        Parking Parking1 =new Parking(100,cars);

        Airport emamKh=new Airport(9,airplanes,helicopters,Parking1);

        System.out.println(emamKh.getClass());
    }

}
