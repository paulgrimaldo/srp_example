package com.mdeis.group4.srp.goodimpl;


import com.mdeis.group4.srp.CarApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("GoodCarController")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/cars/goodimpl")
    public CarApi saveNewCar(@RequestBody CarApi newCarData) {
        if (newCarData.getId() != null) {
            throw new IllegalArgumentException("New Car can't have an id");
        }
        return carService.saveCar(newCarData);
    }
}
