package com.centurlink.graphdb.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Service {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Relationship(type = "ServiceName", direction = Relationship.INCOMING)
	private MessageServiceRole service;

	public MessageServiceRole getService() {
		return service;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Service(String name) {
		super();
		this.name = name;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

}
