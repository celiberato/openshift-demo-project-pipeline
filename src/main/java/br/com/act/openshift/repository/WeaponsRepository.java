package br.com.act.openshift.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.act.openshift.model.Weapons;

public interface WeaponsRepository extends MongoRepository<Weapons, String>{
	
	

}
