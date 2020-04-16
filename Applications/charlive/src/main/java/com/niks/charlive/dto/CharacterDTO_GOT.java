package com.niks.charlive.dto;

import com.niks.charlive.entity.Character_GOT;

public class CharacterDTO_GOT {

	
	
	private String name;
	private String realName;
	private String location;
	
	
	public CharacterDTO_GOT(String name, String realName, String location) {
		super();
		this.name = name;
		this.realName = realName;
		this.location = location;
	}
	
	public Character_GOT convertToEntity() {
		Character_GOT cg = new Character_GOT(this.name,this.realName,this.location);
		return cg;
	}
	
	
	@Override
	public String toString() {
		return "CharacterDTO_GOT [name=" + name + ", realName=" + realName + ", location=" + location + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
