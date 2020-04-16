package com.niks.charlive.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niks.charlive.dto.CharacterDTO_GOT;
import com.niks.charlive.dto.CharacterDTO_GOT_PUT;
import com.niks.charlive.entity.Character_GOT;
import com.niks.charlive.service.CharliveService;

@RestController
@RequestMapping("/charlive")
public class CharliveController {

	@Autowired
	private CharliveService cservice;
	
	@GetMapping("/char")
	public List<Character_GOT> fetchCharacter(){
			
		
		List<Character_GOT> temp = cservice.fetchCharacter();
		for(Character_GOT cg: temp) {
			System.out.println(cg);
		}
		return temp;
		
	}
	
	@GetMapping("/char/{id}")
	public Optional<Character_GOT> fetchOneCharacter(@PathVariable("id") int id ){
		//System.out.println(id);
		return cservice.fetchOneCharacter(id);
	}
	
	@PostMapping("/char")
	public int saveCharacter(@RequestBody CharacterDTO_GOT cdto) {
		return cservice.saveCharacter(cdto);
	}
	
	@PutMapping("/char/{id}")
	public String updateCharacter(@PathVariable("id") int id, @RequestBody CharacterDTO_GOT_PUT cdto) {
		return cservice.updateCharacter(id, cdto);
	}
	
	
	@DeleteMapping("/char/{id}")
	public String deleteCharacter(@PathVariable("id") int id) {
		return cservice.deleteCharacter(id);
	}
	
}



