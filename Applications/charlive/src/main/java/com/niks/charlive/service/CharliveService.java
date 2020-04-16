package com.niks.charlive.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.niks.charlive.dto.*;
import com.niks.charlive.repository.CharliveRepository;
import com.niks.charlive.entity.*;
@Service
public class CharliveService {

	
	@Autowired
	private CharliveRepository crepo;
	
	@Autowired
	private DiscoveryClient client;
	
	@Autowired
	private RestTemplate res;
	
	@Value("${chardead.post.url}")
	private String posturl;
	
	
	
	public List<Character_GOT> fetchCharacter(){
		return crepo.findAll();
	}
	
	
	public Optional<Character_GOT> fetchOneCharacter(int id) {
		return crepo.findById(id);
	}
	
	public int saveCharacter(CharacterDTO_GOT cdto) {
		Character_GOT cgot = cdto.convertToEntity();
		cgot = crepo.save(cgot);
		return cgot.getId();
	}
	
	public String updateCharacter(int id, CharacterDTO_GOT_PUT cdgpo) {
		
		//Character_GOT cgot = cdgpo.convertToEntity();
		String name = cdgpo.getName();
		String realName = cdgpo.getRealName();
		String location = cdgpo.getLocation();
		
		crepo.updateCharacter(name, realName, location, id);
		
		
		return "Successful";
	}


	public String deleteCharacter(int id) {


		
		
		Optional<Character_GOT> cg = fetchOneCharacter(id);
		Character_GOT centity = cg.get();
		CharacterDead_POST dtopost = new CharacterDead_POST(centity.getName(), centity.getRealName(), centity.getLocation());
		
/*
		List<ServiceInstance> instances=client.getInstances("chardead");
		ServiceInstance instance=instances.get(0);
		URI urr = instance.getUri();
		System.out.println(urr+posturl);
		*/
		String urr = "http://CHARDEAD";
		System.out.println(urr+posturl);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<CharacterDead_POST> body = new HttpEntity<CharacterDead_POST>(dtopost,headers);
		res.exchange(urr+posturl, HttpMethod.POST, body, String.class);


		crepo.deleteById(id);
		
		
		return "Success";
	}

}
