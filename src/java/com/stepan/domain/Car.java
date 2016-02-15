package com.stepan.domain;

/**
 * Created by Michal on 15.2.2016.
 */
public class Car {

    private String spz;
    private String manufacturer;
    private String carName;

    public Car(String spz) {
        this.spz = spz;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
