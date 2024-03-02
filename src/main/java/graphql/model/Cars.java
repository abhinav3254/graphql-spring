package graphql.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Float milesPerGallon;
    private Integer cylinders;
    private Integer displacement;
    private Integer horsepower;
    private Integer weightInLbs;
    private Float acceleration;
    private Date year;
    private String origin;

}
