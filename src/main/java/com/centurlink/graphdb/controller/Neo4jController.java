package com.centurlink.graphdb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centurlink.graphdb.services.Neo4jService;

@RestController
@RequestMapping("/rest")
public class Neo4jController {

	private final Neo4jService neo4jService;

	public Neo4jController(Neo4jService neo4jService) {
		super();
		this.neo4jService = neo4jService;
	}

	@GetMapping("/getServiceName/{messageType}")
	public String getMessageNodeDetails(@PathVariable String messageType) {
		return neo4jService.findByName(messageType).getServiceName();
	}

	@GetMapping("/getEventName/{eventType}")
	public String getEventNodeDetails(@PathVariable String eventType) {
		return neo4jService.findByEventName(eventType).getName();
	}

}
