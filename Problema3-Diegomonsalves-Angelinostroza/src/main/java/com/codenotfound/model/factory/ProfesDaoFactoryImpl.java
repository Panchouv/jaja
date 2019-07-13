package com.codenotfound.model.factory;

import com.codenotfound.model.dao.*;

public class ProfesDaoFactoryImpl extends ProfesDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public ProfesDao getProfesDao() {
        return new ProfesDaoImpl();
    }


}