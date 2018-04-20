package com.centurlink.graphdb.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.centurlink.graphdb.model.Product;
import com.centurlink.graphdb.model.Message;

public interface EventTypeRepository extends Neo4jRepository<Message, Long> {

	Product findByName(String name);

}