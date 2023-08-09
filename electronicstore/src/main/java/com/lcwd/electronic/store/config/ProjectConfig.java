package com.lcwd.electronic.store.config;

import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class ProjectConfig {
	
	public ModelMapper mapper() {
		return new ModelMapper();
	}

}
