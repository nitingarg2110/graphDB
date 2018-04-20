package com.centurlink.graphdb.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Message {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String serviceName;

	@Relationship(type = "ServiceName", direction = Relationship.OUTGOING)
	private MessageServiceRole services;

	@Relationship(type = "MessageType", direction = Relationship.INCOMING)
	private ProductMessageRole messageType;

	public MessageServiceRole getServices() {
		return services;
	}

	public ProductMessageRole getMessageType() {
		return messageType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Message(String name) {
		super();
		this.name = name;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MessageType [name=" + name + ", serviceName=" + serviceName + ", services=" + services
				+ ", messageType=" + messageType + "]";
	}

}
