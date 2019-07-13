package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Profes;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryP")
public class ProfesDaoImpl implements ProfesDao {

    @Override
    public List findAll() {
        List<Profes> list = new ArrayList<Profes>();
        Profes profes = null;
        String data = this.readFile();
        for (String nombreProfes : data.split(";")) {
            profes = new Profes();
            profes.setNombre(nombreProfes.trim());
            list.add(profes);
        }
        return list;
    }

    private String readFile()  {
        String data = "";
        try {
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}