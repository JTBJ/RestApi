package com.pyramid.part.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.pyramid.part.entity.Parts;
import com.pyramid.part.service.PartsService;

@Configuration
public class PartsConfig {
	
	@Autowired
	PartsService partsService;
	
	@PostConstruct
	public void populateDatabase() {
		
		partsService.addPart(new Parts("Motherboard", 79.00));
		partsService.addPart(new Parts("Chassis", 100.00));
		partsService.addPart(new Parts("Ram", 14.00));
		partsService.addPart(new Parts("Storage", 53.00));
		partsService.addPart(new Parts("PCI", 12.00));
		partsService.addPart(new Parts("CPU", 70.00));
		partsService.addPart(new Parts("Power Supply", 50.00));
		partsService.addPart(new Parts("Optical Drive", 16.00));
		partsService.addPart(new Parts("External Drive", 300.00));
		partsService.addPart(new Parts("Monitor", 42.00));
		partsService.addPart(new Parts("Mouse", 6.00));
		partsService.addPart(new Parts("Keyboard", 13.00));
		partsService.addPart(new Parts("Operating System", 15.00));
		partsService.addPart(new Parts("License", 200.00));
	}
}
