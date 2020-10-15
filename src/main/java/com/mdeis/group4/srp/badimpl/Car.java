package com.mdeis.group4.srp.badimpl;


import lombok.Data;

@Data
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;

    public int save() {
        System.out.println("Saving car with bad implementation...");
        return 1;
    }

    public void update() {
        System.out.println("Updating car");
    }

    public boolean delete() {
        System.out.println("Deleting car");
        return true;
    }
}
