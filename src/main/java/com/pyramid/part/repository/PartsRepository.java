package com.pyramid.part.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyramid.part.entity.Parts;

public interface PartsRepository extends JpaRepository<Parts, Integer> {

}
