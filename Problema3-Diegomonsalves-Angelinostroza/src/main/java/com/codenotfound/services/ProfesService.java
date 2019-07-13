package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.model.factory.*;


@Named
public class ProfesService {
	
	private ProfesDaoFactory profesDaoFactory ;
	
	
	public ProfesService() {
		this.profesDaoFactory = (ProfesDaoFactory)DAOFactory.getDAOFactory(DAOFactory.PROFES_REPOSITORY);
	}
	

    public List<Profes> getProfestList() {
        return this.profesDaoFactory.getProfesDao().findAll();

    }
    

}