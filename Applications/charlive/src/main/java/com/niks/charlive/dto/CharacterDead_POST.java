package com.niks.charlive.dto;

public class CharacterDead_POST {

	
	String name;
	String real_Name;
	String location;
	
	
	public CharacterDead_POST(String name, String real_Name, String location) {
		super();
		this.name = name;
		this.real_Name = real_Name;
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Character_Dead_DTO_POST_GOT [name=" + name + ", real_Name=" + real_Name + ", location=" + location
				+ "]";
	}

	public CharacterDead_POST() {
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