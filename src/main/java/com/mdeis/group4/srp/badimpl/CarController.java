package com.mdeis.group4.srp.badimpl;


import com.mdeis.group4.srp.CarApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("BadCarController")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/cars/badimpl")
    public CarApi saveNewCar(@RequestBody CarApi newCarData) {
        if (newCarData.getId() != null) {
            throw new IllegalArgumentException("New Car can't have an id");
        }
        return carService.saveCar(newCarData);
    }
}
