package br.com.act.openshift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.act.openshift.model.Weapons;
import br.com.act.openshift.repository.WeaponsRepository;

@Service
public class WeaponsService {
	
	@Autowired
	private WeaponsRepository weaponsRepository;
	
	
	public void save(Weapons weapons) {
		weaponsRepository.save(weapons);
	}

}
