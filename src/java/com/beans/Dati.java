/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author liliana
 */
public class Dati {

    private String name;
    private String dob;
    private String email;

    public Dati(String name, String dob, String email) {
        super();
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Dati() {
        this.name = "sss";
        this.dob = "ssss";
        this.email = "ssss";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
        return this.name+", "+this.dob+" - "+this.email;
    }
}
