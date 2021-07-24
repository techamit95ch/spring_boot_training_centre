package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.*;

public interface CentreServices {
	public List<Centre> getCentres();
	public void addCentre(Centre centre);
}
