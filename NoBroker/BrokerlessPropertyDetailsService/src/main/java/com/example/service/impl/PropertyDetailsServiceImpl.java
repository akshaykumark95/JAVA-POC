package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.entity.PropertyDetails;
import com.example.exception.NoSearchResultFoundException;
import com.example.repo.PropertyDetailsRepo;
import com.example.service.IPropertyDetailsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PropertyDetailsServiceImpl implements IPropertyDetailsService {

	@Autowired
	private PropertyDetailsRepo repo;
	
	@Override
	public String savePropertyDetails(PropertyDetails details) {
		log.info("INTO SAVEPROPERTYDETAILS METHOD");
		PropertyDetails savedPropertyDetails = repo.save(details);
		log.info("ABOUT TO EXIT FROM SAVEPROPERTYDETAILS");
		return new StringBuilder().append("Property details are stored with id : ").append(savedPropertyDetails.getId()).toString();
	}

	@Override
	public List<PropertyDetails> searchPropertyDetails(PropertyDetails details) {
		Example<PropertyDetails> search = Example.of(details);
		List<PropertyDetails> list = repo.findAll(search);
		if(list.isEmpty())
			throw new NoSearchResultFoundException("No Property Found!");
		return list;
	}
	
	 

}
