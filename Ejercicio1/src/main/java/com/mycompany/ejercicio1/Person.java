/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.time.LocalDate;
/**
 *
 * @author bbotelho42
 */
public class Person {

    private int idPerson;
    private String name;
    private String email;
    private String tel;
    private boolean IndividualPerson;
    private LocalDate startDate;
    private LocalDate deactivationDate;
    private boolean active;
    
    public Person(){}; //Empty Constructor
    
    public Person(int idPerson, String name, String email, String tel, boolean isIndividualPerson, LocalDate startDate, LocalDate deactivationDate, boolean active) {
        this.idPerson = idPerson;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.IndividualPerson = isIndividualPerson;
        this.startDate = startDate;
        this.deactivationDate = deactivationDate;
        this.active = active;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isIndividualPerson() {
        return IndividualPerson;
    }

    public void setIndividualPerson(boolean IndividualPerson) {
        this.IndividualPerson = IndividualPerson;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDate deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    @Override
    public String toString() {
        String persona, isOperative = isActive() && getDeactivationDate() == null ? "activa" : "inactiva", inactive;
        char n = '\n';
        if (isIndividualPerson())
            persona = "Persona Fisica";
        else
            persona = "Persona Juridica";
        inactive = isOperative.equalsIgnoreCase("inactiva") ? "DADA DE BAJA" : "";
        return "Datos personales:"+n+"-----------------"+n+
                "Nombre: "+getName()+n+
                "Email: "+getEmail()+n+
                "Telefono: "+getTel()+n+
                "Entidad: "+persona+n+
                "Fecha de alta: "+getStartDate()+n+
                "Estado: "+isOperative+n+inactive;
    }
    
    
}
