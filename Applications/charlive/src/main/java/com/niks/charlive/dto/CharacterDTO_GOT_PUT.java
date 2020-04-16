package com.niks.charlive.dto;

import com.niks.charlive.entity.Character_GOT;

public class CharacterDTO_GOT_PUT {

	
	
	private int id;
	private String name;
	private String realName;
	private String location;
	
	
	
	public CharacterDTO_GOT_PUT(int id, String name, String realName, String location) {
		super();
		this.id = id;
		this.name = name;
		this.realName = realName;
		this.location = location;
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
	
	public Character_GOT convertToEntity() {
		Character_GOT cg = new Character_GOT(this.name, this.realName, this.location);
		cg.setId(this.id);
		return cg;
	}
	
	
	
}
