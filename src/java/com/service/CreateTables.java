/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.service;

import com.beans.WebAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sasha Alexandru Podgoreanu
 */
public class CreateTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            DBController.registerDB();
            DBController.createTables();
            
            WebAdmin webA = new WebAdmin();
            webA.setLogin("Sasha");
            webA.setNome("Sasha Alexandru");
            webA.setPassword("645128wasd");
            webA.register();

        } catch (SQLException ex) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
