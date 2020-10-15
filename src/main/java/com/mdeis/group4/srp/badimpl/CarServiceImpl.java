package com.mdeis.group4.srp.badimpl;


import com.mdeis.group4.srp.CarApi;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service("BadCarService")
public class CarServiceImpl implements CarService {

    @Override
    public CarApi saveCar(CarApi newCarData) {
        ModelMapper mapper = new ModelMapper();
        Car newCar = mapper.map(newCarData, Car.class);
        int newCarId = newCar.save();

        CarApi carResponse = mapper.map(newCar, CarApi.class);
        carResponse.setId(newCarId);

        return carResponse;
    }
}
