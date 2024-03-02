package graphql;

import graphql.controller.CarController;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlJavaApplication.class, args);
	}

}
