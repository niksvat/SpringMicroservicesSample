package com.niks.charlive.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.niks.charlive.entity.Character_GOT;

public interface CharliveRepository extends JpaRepository<Character_GOT, Integer>{

	
	@Transactional
	@Modifying
	@Query(value = "update Character_GOT set name=?, real_Name=?, location=? where id=?", nativeQuery=true)
	void updateCharacter(String name, String realName, String location, int id);
	
	
}
