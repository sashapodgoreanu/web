/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.beans;

import com.service.DBController;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sasha Alexandru Podgoreanu
 */
public class Immagine {
	private int id;
	private String url;
	private String descrizione;
	private int numVis;
	private Date dataCaricamento;
	private Dimension dim;
        
        public boolean save(){
            boolean result = false;
            
            try { 
                result = DBController.execute(this);
            } catch (SQLException ex) {
                Logger.getLogger(Immagine.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            }
            return result;
        }

	public int getId() {
		return this.id;
	}

	public void setId(int aId) {
		this.id = aId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String aUrl) {
		this.url = aUrl;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String aDescrizione) {
		this.descrizione = aDescrizione;
	}

	public int getNumVis() {
		return this.numVis;
	}

	public void setNumVis(int aNumVis) {
		this.numVis = aNumVis;
	}

	public Date getDataCaricamento() {
		return this.dataCaricamento;
	}

	public void setDataCaricamento(Date aDataCaricamento) {
		this.dataCaricamento = aDataCaricamento;
	}

	public Dimension getDim() {
		return this.dim;
	}

	public void setDim(Dimension aDim) {
		this.dim = aDim;
	}
}
