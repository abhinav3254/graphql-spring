package graphql.service;


import graphql.model.Cars;
import graphql.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
