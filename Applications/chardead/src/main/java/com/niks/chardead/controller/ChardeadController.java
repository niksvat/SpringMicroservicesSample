package com.niks.chardead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niks.chardead.DTO.Character_Dead_DTO_GOT;
import com.niks.chardead.DTO.Character_Dead_DTO_POST_GOT;
import com.niks.chardead.Entity.*;
import com.niks.chardead.service.ChardeadService;

import java.util.*;
@RestController
@RequestMapping(value="/chardead")
public class ChardeadController {

	
	@Autowired
	private ChardeadService cserve;
	
	@GetMapping(value="/dead")
	public List<Character_Dead_DTO_GOT> getCharDead(){
		System.out.println("=== Got the response ===");
		return cserve.getAllChar();
	}
	
	
	@GetMapping(value="/dead/{id}")
	public Character_Dead_DTO_GOT getCharDeadOne(@PathVariable("id") int id) {
		return cserve.getOneChar(id);
	}
	
	@PostMapping(value="/dead")
	public String addChar(@RequestBody Character_Dead_DTO_POST_GOT cdto) {
		System.out.println(cdto);
		return cserve.addChar(cdto);
	}
	
	@PutMapping(value="/dead/{id}")
	public String updateChar(@PathVariable int id, @RequestBody Character_Dead_DTO_GOT cdto) {
		return cserve.updateChar(id,cdto);
	}
	
	@DeleteMapping(value="/dead/{id}")
	public String deleteChar(@PathVariable("id") int id) {
		return cserve.deleteChar(id);
	}
	
}
