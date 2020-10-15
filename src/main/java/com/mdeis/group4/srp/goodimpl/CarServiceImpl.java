package com.mdeis.group4.srp.goodimpl;

import com.mdeis.group4.srp.CarApi;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service("GoodCarService")
public class CarServiceImpl implements CarService {
    final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public CarApi saveCar(CarApi newCarData) {
        ModelMapper mapper = new ModelMapper();
        Car carEntity = mapper.map(newCarData, Car.class);

        Car savedCar = carRepository.saveNewCar(carEntity);
        return mapper.map(savedCar, CarApi.class);
    }
}
