package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.springrest.springrest.entities.Address;

public interface AddressDao extends JpaRepository<Address, Long>{

}
