package com.centurlink.graphdb.model;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Relationship(type = "MessageType", direction = Relationship.OUTGOING)
	private Set<ProductMessageRole> messageTypes;

	public Set<ProductMessageRole> getMessageTypes() {
		return messageTypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product(String name) {
		super();
		this.name = name;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}
