/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.service.DBController;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PreDestroy;

/**
 *
 * @author Sasha Alexandru Podgoreanu
 */
public class WebAdmin {

    private String nome;
    private String password;
    private String login;
    private boolean valid;
    private String lastOnline;

    public String getLogin() {
        return login;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public WebAdmin(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public WebAdmin() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate() {

        try {
            valid = DBController.verificaUtente(this);
            if (valid) {
                java.util.Date date = new java.util.Date();
                String updateLastAccessQuerry = "UPDATE WEB_ADMIN "
                        + " SET LASTLOGIN ='" + (new Timestamp(date.getTime())) + "'"
                        + " WHERE LOGIN = '" + this.login + "';";
                DBController.execute(updateLastAccessQuerry);
            }

        } catch (SQLException ex) {
            Logger.getLogger(WebAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valid;

    }

    public boolean register() {
        java.util.Date date = new java.util.Date();
        String querry = "INSERT INTO WEB_ADMIN VALUES ('" + this.getLogin() + "','" + this.getNome() + "','" + this.getPassword() + "','"
                + (new Timestamp(date.getTime())) + "');";
        try {
            return DBController.execute(querry);
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public String toString() {
        return "WebAdmin{" + "nome=" + nome + ", password=" + password + ", login=" + login + '}';
    }

    public void cleanUp() {
        System.out.println("Cleaning up" + this.toString());
        java.util.Date date = new java.util.Date();
        String updateLastAccessQuerry = "UPDATE WEB_ADMIN "
                + " SET LASTLOGIN ='" + (new Timestamp(date.getTime())) + "'"
                + " WHERE LOGIN = '" + this.login + "';";
        try {
            DBController.execute(updateLastAccessQuerry);
        } catch (SQLException ex) {
            Logger.getLogger(WebAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
