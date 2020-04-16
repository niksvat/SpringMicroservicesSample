package com.niks.chardead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niks.chardead.repository.ChardeadRepository;
import com.niks.chardead.DTO.*;
import com.niks.chardead.Entity.*;
import java.util.*;

@Service
public class ChardeadService {

	@Autowired
	private ChardeadRepository crepo;
	
	public List<Character_Dead_DTO_GOT> getAllChar(){
		
		ArrayList<Character_Dead_DTO_GOT> al = new ArrayList<Character_Dead_DTO_GOT>();
		List<Character_Dead_GOT> cdg = crepo.findAll();
		for(Character_Dead_GOT cc: cdg) {
			al.add(cc.convertToDto());
		}
		return al;	
	}
	
	public Character_Dead_DTO_GOT getOneChar(int id) {
		
		Optional<Character_Dead_GOT>  cdg = crepo.findById(id);
		Character_Dead_DTO_GOT cc = new Character_Dead_DTO_GOT(cdg.get().getId(),cdg.get().getName(),cdg.get().getReal_Name(),
				cdg.get().getLocation());
		return cc;
		
	}
	
	public String addChar(Character_Dead_DTO_POST_GOT cdto) {
		Character_Dead_GOT centity = cdto.convertToEntity();
		crepo.saveAndFlush(centity);
		return "Success";
	}
	
	public String updateChar(int id, Character_Dead_DTO_GOT cdto) {
		
		
		crepo.updateChar(cdto.getName(), cdto.getReal_Name(), cdto.getLocation(),id);
		return "Success";
		
	}
	
	public String deleteChar(int id) {
		
		crepo.deleteById(id);
		return "Success";
	}
	
	
}
