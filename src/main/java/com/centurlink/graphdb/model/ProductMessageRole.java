package com.centurlink.graphdb.model;

import java.util.Set;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * @author Mark Angrish
 */
@RelationshipEntity(type = "MessageType")
public class ProductMessageRole {

	@Id
	@GeneratedValue
	private Long id;

	private Set<Message> messageTypes;

	@StartNode
	private Product eventType;

	@EndNode
	private Message msgType;

	public ProductMessageRole() {
	}

	public ProductMessageRole(Product eventType, Message msgType) {
		super();
		this.eventType = eventType;
		this.msgType = msgType;
	}

	public Long getId() {
		return id;
	}

	public Set<Message> getMessageTypes() {
		return messageTypes;
	}

	public Product getEventType() {
		return eventType;
	}

	public Message getMsgType() {
		return msgType;
	}

}