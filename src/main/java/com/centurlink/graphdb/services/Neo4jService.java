package com.centurlink.graphdb.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.centurlink.graphdb.model.Product;
import com.centurlink.graphdb.model.Message;
import com.centurlink.graphdb.repositories.EventTypeRepository;
import com.centurlink.graphdb.repositories.MessageTypeRepository;

@Service
public class Neo4jService {

	private final MessageTypeRepository messageTypeRepo;

	private final EventTypeRepository eventTypeRepo;

	public Neo4jService(MessageTypeRepository messageTypeRepo, EventTypeRepository eventTypeRepo) {
		super();
		this.messageTypeRepo = messageTypeRepo;
		this.eventTypeRepo = eventTypeRepo;
	}

	@Transactional(readOnly = true)
	public Message findByName(String messageName) {
		Message result = messageTypeRepo.findByName(messageName);
		return result;
	}

	@Transactional(readOnly = true)
	public Product findByEventName(String eventType) {
		Product result = eventTypeRepo.findByName(eventType);
		return result;
	}

}
