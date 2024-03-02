package graphql.service;


import graphql.model.CarInput;
import graphql.model.Cars;
import graphql.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public Cars updateCar(Long id, CarInput carInput) {
        Optional<Cars> optionalCars = carsRepository.findById(id);
        if (optionalCars.isPresent()) {
            Cars cars = optionalCars.get();
            if (carInput.getName() != null) cars.setName(carInput.getName());
            if (carInput.getMilesPerGallon() != null) cars.setMilesPerGallon(carInput.getMilesPerGallon());
            if (carInput.getCylinders() != null) cars.setCylinders(carInput.getCylinders());
            if (carInput.getDisplacement() != null) cars.setDisplacement(carInput.getDisplacement());
            if (carInput.getHorsepower() != null) cars.setHorsepower(carInput.getHorsepower());
            if (carInput.getWeightInLbs() != null) cars.setWeightInLbs(carInput.getWeightInLbs());
            if (carInput.getAcceleration() != null) cars.setAcceleration(carInput.getAcceleration());
            if (carInput.getOrigin() != null) cars.setOrigin(carInput.getOrigin());

            carsRepository.save(cars);
            return cars;
        } else {
            return null;
        }
    }

}
