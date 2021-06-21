package com.oimarket.oimarket_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oimarket.oimarket_back.model.Members;

@Repository
public interface MembersRepository extends JpaRepository<Members, Integer>{

}
