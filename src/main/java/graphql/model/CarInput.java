package graphql.model;


import lombok.Data;

import java.util.Date;

@Data
public class CarInput {
    private String name;
    private Float milesPerGallon;
    private Integer cylinders;
    private Integer displacement;
    private Integer horsepower;
    private Integer weightInLbs;
    private Float acceleration;
    private String origin;
}
