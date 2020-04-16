package com.niks.chardead.DTO;

import com.niks.chardead.Entity.Character_Dead_GOT;

public class Character_Dead_DTO_GOT {


	int id;
	String name;
	String real_Name;
	String location;
	
	public Character_Dead_DTO_GOT(int id, String name, String real_Name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.real_Name = real_Name;
		this.location = location;
	}
	
	public Character_Dead_DTO_GOT() {
		super();

	}
	
	public Character_Dead_GOT convertoEntity() {
		return new Character_Dead_GOT(this.id, this.name, this.real_Name, this.location);
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
		return real_Name;
	}
	public void setReal_Name(String real_Name) {
		this.real_Name = real_Name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
