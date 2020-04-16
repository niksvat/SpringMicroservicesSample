package com.niks.chardead.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.niks.chardead.DTO.Character_Dead_DTO_GOT;

@Entity
public class Character_Dead_GOT {
	
	@Id @GeneratedValue
	int id;
	
	String name;
	String real_name;
	String location;
	
	public Character_Dead_GOT(int id, String name, String real_Name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.real_name = real_Name;
		this.location = location;
	}
	
	public Character_Dead_GOT() {
		super();

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReal_Name() {
		return real_name;
	}
	public void setReal_Name(String real_Name) {
		this.real_name = real_Name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Character_Dead_DTO_GOT convertToDto() {
		return new Character_Dead_DTO_GOT(this.id,this.name, this.real_name, this.location);
	}
	

}
