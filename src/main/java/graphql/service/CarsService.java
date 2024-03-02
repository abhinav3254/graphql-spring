package graphql.service;


import graphql.model.CarInput;
import graphql.model.Cars;
import graphql.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarsRepository carsRepository;

    public List<Cars> findAll() {
        return this.carsRepository.findAll();
    }

    public Cars findOne(Long id) {
        return this.carsRepository.findById(id).get();
    }

    public Cars addCar(CarInput car) {
        Cars cars = new Cars();
        cars.setName(car.getName());
        cars.setMilesPerGallon(car.getMilesPerGallon());
        cars.setCylinders(car.getCylinders());
        cars.setDisplacement(car.getDisplacement());
        cars.setHorsepower(car.getHorsepower());
        cars.setWeightInLbs(car.getWeightInLbs());
        cars.setAcceleration(car.getAcceleration());
        cars.setYear(new Date());
        cars.setOrigin(car.getOrigin());

        carsRepository.save(cars);
        return cars;
    }
}
