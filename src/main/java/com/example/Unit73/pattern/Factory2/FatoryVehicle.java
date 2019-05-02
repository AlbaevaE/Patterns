package com.example.Unit73.pattern.Factory2;

public abstract class FatoryVehicle {
    public void makeVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
    public abstract Vehicle createVehicle();
}
