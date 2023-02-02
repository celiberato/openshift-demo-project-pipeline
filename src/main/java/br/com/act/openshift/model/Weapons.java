package br.com.act.openshift.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("weapons")
public class Weapons {
	
	@Id
    private String id;
	private int quantidy;
	private String name;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getQuantidy() {
		return quantidy;
	}


	public void setQuantidy(int quantidy) {
		this.quantidy = quantidy;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
