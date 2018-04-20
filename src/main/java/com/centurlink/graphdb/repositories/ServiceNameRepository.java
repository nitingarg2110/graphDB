package com.centurlink.graphdb.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.centurlink.graphdb.model.Service;

public interface ServiceNameRepository extends Neo4jRepository<Service, Long> {

	Service findByName(String name);

}