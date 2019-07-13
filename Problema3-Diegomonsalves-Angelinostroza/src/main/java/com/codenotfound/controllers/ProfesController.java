package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.*;
import com.codenotfound.services.*;

@Named
public class ProfesController{

  private String firstName = "Angel";
  private String lastName = "Inostroza";
  
  private List<Profes> listaProfes = new ArrayList<Profes>();
  
  @Inject
  private ProfesService profesService;

  @PostConstruct
  public void init(){
    this.listaProfes = profesService.getProfestList();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    Profes s = new Profes();
    s.setNombre(firstName + " " + lastName);
    this.listaProfes.add(s);
    return "Hello " + firstName + " " + lastName + "!";
  }

    /**
     * @return List<Profes> return the listaProfes
     */
    public List<Profes> getListaProfes() {
        return listaProfes;
    }

}
