package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public abstract class ProfesDaoFactory extends DAOFactory{
	
    public abstract ProfesDao getProfesDao();
    
}



