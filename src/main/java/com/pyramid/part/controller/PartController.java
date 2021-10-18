package com.pyramid.part.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pyramid.part.entity.Parts;
import com.pyramid.part.service.PartsService;

@RestController
public class PartController {

	@Autowired
	PartsService partsService;
	
    @GetMapping("/parts")
    public List<Parts> listParts(){
        return partsService.listParts();
    }
    
    @GetMapping("/parts/{id}")
    public Parts listPartById(@PathVariable int id){
        return partsService.getPartById(id);
    }
    
    @PostMapping("/parts")
    public void addPart(@RequestBody Parts parts) {
    	parts.setId(0);
    	partsService.addPart(parts);
    }
    
    @PutMapping("/parts")
    public void updateParts(@RequestBody Parts parts) {
    	partsService.addPart(parts);
    }

    @DeleteMapping("/parts/{id}")
    public void deletePartById(@PathVariable int id) {
    	partsService.deletePartById(id);
    }

}
