package com.pyramid.part.service;

import java.util.List;

import com.pyramid.part.entity.Parts;

public interface PartsService {

	public List<Parts>listParts();  
	public Parts getPartById(int id);
	public void addPart(Parts part); 
	public void deletePartById(int id);
}
