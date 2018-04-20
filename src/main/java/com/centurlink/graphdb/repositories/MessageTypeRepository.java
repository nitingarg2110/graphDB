package com.centurlink.graphdb.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.centurlink.graphdb.model.Message;

public interface MessageTypeRepository extends Neo4jRepository<Message, Long> {

	Message findByName(String name);

}