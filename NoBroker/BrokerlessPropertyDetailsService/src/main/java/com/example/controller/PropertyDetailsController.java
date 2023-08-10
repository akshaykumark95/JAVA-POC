package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PropertyDetails;
import com.example.exception.NoSearchResultFoundException;
import com.example.service.IPropertyDetailsService;

@RestController
@RequestMapping("/property/details")
public class PropertyDetailsController {
	
	@Autowired
	private IPropertyDetailsService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> addPropertyDetails(@RequestBody PropertyDetails details){
		return ResponseEntity.ok(service.savePropertyDetails(details));
	}
	
	@PostMapping("/search")
	public ResponseEntity<?> getPropertyDetails(@RequestBody PropertyDetails details){
		try {
			return ResponseEntity.ok(service.searchPropertyDetails(details));
		} catch (NoSearchResultFoundException nsrfe) {
			throw nsrfe;
		}
	}
}
