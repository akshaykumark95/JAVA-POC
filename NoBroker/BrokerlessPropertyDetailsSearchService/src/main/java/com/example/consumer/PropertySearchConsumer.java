package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.PropertyDetails;

@FeignClient(name = "PROPERTY-DETAILS-SERVICE")
public interface PropertySearchConsumer {
	@GetMapping("/property/details/search")
	public ResponseEntity<?> getPropertyDetails(@RequestBody PropertyDetails details);
	
}
