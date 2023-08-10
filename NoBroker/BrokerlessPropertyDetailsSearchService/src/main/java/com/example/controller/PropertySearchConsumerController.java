package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.PropertySearchConsumer;
import com.example.entity.PropertyDetails;
import com.example.exception.NoSearchResultFoundException;

@RestController
@RequestMapping("/search")
public class PropertySearchConsumerController {
	
	@Autowired
	private PropertySearchConsumer consumer;
	
	@PostMapping("/property")
	public ResponseEntity<?> searchPropertyDetails(@RequestBody PropertyDetails details ){
		ResponseEntity<?> resp = null;
		try {
			resp = ResponseEntity.ok(consumer.getPropertyDetails(details).getBody());
		} catch (NoSearchResultFoundException nsrfe) {
			throw nsrfe;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
}
