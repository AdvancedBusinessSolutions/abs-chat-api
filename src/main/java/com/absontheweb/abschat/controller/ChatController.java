package com.absontheweb.abschat.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {
	
	@RequestMapping(value = "/menu", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<Object> getMenu() throws Exception {
			
			return ResponseEntity.ok()
					.body("TEST OK");
			
	}
}