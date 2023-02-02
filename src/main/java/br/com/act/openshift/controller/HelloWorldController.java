package br.com.act.openshift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.act.openshift.model.Weapons;
import br.com.act.openshift.service.WeaponsService;

@RestController
public class HelloWorldController {
	
	@Autowired
	private WeaponsService weaponsService;

	@GetMapping("/hello-world")
	public String hello() {
		
		
		Weapons weapons = new Weapons();
		weapons.setName("Knife");
		weapons.setQuantidy(5);
		
		weaponsService.save(weapons);
		
		return "Hello World - V2";
	}
}