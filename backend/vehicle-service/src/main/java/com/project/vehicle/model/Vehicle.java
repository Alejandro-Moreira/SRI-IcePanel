package com.project.vehicle.model;

public class Vehicle {

    private String plate;
    private String vin;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String plate, String vin, String owner) {
        this.plate = plate;
        this.vin = vin;
        this.owner = owner;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
