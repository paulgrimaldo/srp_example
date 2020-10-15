package com.mdeis.group4.srp.goodimpl;

import org.springframework.stereotype.Component;

//@Repository
@Component("GoodCarRepository")
public class CarRepository {

    public Car saveNewCar(Car carData) {
        System.out.println("Saving a car with good implementation....");
        return carData;
    }
}
