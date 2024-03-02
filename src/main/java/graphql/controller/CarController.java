package graphql.controller;

import graphql.model.Cars;
import graphql.service.CarsService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Note here don't make it RestController
 * because we are using graphql and note that it is not rest
 */
@Controller
public class CarController {

    private final CarsService carsService;

    public CarController(CarsService carsService) {
        this.carsService = carsService;
    }

    @QueryMapping(name = "findAll")
    public List<Cars> findAll() {
        return this.carsService.findAll();
    }

    @QueryMapping(name = "findOne")
    public Cars findOne(@Argument Long id) {
        return this.carsService.findOne(id);
    }

}
