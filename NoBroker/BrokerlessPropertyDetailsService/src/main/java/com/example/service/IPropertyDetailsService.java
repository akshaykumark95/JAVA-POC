package com.example.service;

import java.util.List;

import org.springframework.data.domain.Example;

import com.example.entity.PropertyDetails;

public interface IPropertyDetailsService {
	public String savePropertyDetails(PropertyDetails details);
	public List<PropertyDetails> searchPropertyDetails(PropertyDetails details);
}
