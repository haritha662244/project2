package com.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entities.ContactsMasterEntity;

public interface ContactsMasterRepo
                       extends CrudRepository<ContactsMasterRepo ,Integer> {
	
	

}
