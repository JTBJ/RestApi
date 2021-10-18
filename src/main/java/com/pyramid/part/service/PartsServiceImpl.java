package com.pyramid.part.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyramid.part.entity.Parts;
import com.pyramid.part.repository.PartsRepository;

@Service
public class PartsServiceImpl implements PartsService {

	@Autowired
	PartsRepository partsRepository;
	
	@Override
	public List<Parts> listParts() {
		return partsRepository.findAll();
	}

	@Override
	public Parts getPartById(int id) {
		Optional<Parts> result = partsRepository.findById(id);
		
		Parts parts = null;
		
		if(result.isPresent()) {
			parts = result.get();
		}else {
//			System.out.println("No user with the id " + id);
			throw new RuntimeException("No part with the id " + id);
		}
		
		return parts;
	}

	@Override
	public void addPart(Parts part) {
		partsRepository.save(part);
	}

	@Override
	public void deletePartById(int id) {
		partsRepository.deleteById(id);
	}

}
