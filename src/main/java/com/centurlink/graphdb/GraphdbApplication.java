package com.centurlink.graphdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class GraphdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphdbApplication.class, args);
	}
}
