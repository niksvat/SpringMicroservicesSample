package com.niks.charlive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Character_GOT {

	
	@Id @GeneratedValue
	private int id;
	private String name;
	private String realName;
	private String location;
	public Character_GOT() {
		super();
	}
	public Character_GOT(String name, String realName, String location) {
		super();
		this.name = name;
		this.realName = realName;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Character_GOT [id=" + id + ", name=" + name + ", realName=" + realName + ", location=" + location + "]";
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
	
	
}
