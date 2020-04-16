package com.niks.chardead.DTO;

import com.niks.chardead.Entity.Character_Dead_GOT;

public class Character_Dead_DTO_POST_GOT {

	
	String name;
	String real_Name;
	String location;
	
	
	public Character_Dead_DTO_POST_GOT(String name, String real_Name, String location) {
		super();
		this.name = name;
		this.real_Name = real_Name;
		this.location = location;
	}
	
	public Character_Dead_GOT convertToEntity() {
		return new Character_Dead_GOT(1, this.name, this.real_Name, this.location);
	}
	
	@Override
	public String toString() {
		return "Character_Dead_DTO_POST_GOT [name=" + name + ", real_Name=" + real_Name + ", location=" + location
				+ "]";
	}

	public Character_Dead_DTO_POST_GOT() {
		super();
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
