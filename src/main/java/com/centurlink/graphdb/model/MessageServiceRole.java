package com.centurlink.graphdb.model;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "ServiceName")
public class MessageServiceRole {

	@Id
	@GeneratedValue
	private Long id;

	@StartNode
	private Message msgType;

	@EndNode
	private Service service;

	public MessageServiceRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageServiceRole(Message msgType, Service service) {
		super();
		this.msgType = msgType;
		this.service = service;
	}

	public Long getId() {
		return id;
	}

	public Message getMsgType() {
		return msgType;
	}

	public Service getService() {
		return service;
	}

}
