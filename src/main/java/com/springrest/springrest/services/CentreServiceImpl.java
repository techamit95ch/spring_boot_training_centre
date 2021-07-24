package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.*;
import java.util.*;
import com.springrest.springrest.dao.*;

@Service
public class CentreServiceImpl implements CentreServices {

	@Autowired
	private CentreDao centreDao;
	
	public CentreServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Centre> getCentres() {
		// TODO Auto-generated method stub
		return centreDao.findAll();

	}

	@Override
	public void addCentre(Centre centre) {
		// TODO Auto-generated method stub
		centreDao.save(centre);


	}

}
