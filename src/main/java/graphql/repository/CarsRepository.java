package graphql.repository;

import graphql.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars,Long> {
}
