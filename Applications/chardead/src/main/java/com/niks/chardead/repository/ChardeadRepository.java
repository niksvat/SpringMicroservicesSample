package com.niks.chardead.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.niks.chardead.Entity.Character_Dead_GOT;

public interface ChardeadRepository extends JpaRepository<Character_Dead_GOT, Integer>{

	
	@Query(value="update Character_Dead_GOT set name=?, real_name=?, location=? where id=?", nativeQuery=true)
	@Modifying
	@Transactional
	public void updateChar(String name, String real_Name, String location,int id);
	
}
