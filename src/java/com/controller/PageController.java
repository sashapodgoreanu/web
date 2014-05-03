/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.beans.Dati;
import com.service.DBController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author liliana
 */
@Controller
public class PageController {

    Dati d;
    
    /*@Autowired
    com.service.DBClasses Service;*/

    
    @RequestMapping(value = {"index/"}, method = RequestMethod.GET)
    public ModelAndView wellcome(HttpSession session) {
        String h = "Heloooo";
        session.setAttribute("heloString",h);
        ModelAndView mav = new ModelAndView("index");//add view - index.jsp
        String s = "Hi!! This content has been produced by MyController!!";
        mav.addObject("helloMessage", s);//add model
        mav.addObject("d", d);
        return mav;
    }
    
    @RequestMapping(value = {"note-legali/"}, method = RequestMethod.GET)
    public ModelAndView noteLegali() {
        ModelAndView mav = new ModelAndView("noteLegali");//add view - noteLegali.jsp  
        return mav;
    }
    
    @RequestMapping(value = {"azienda/"}, method = RequestMethod.GET)
    public ModelAndView azienda() {
        ModelAndView mav = new ModelAndView("noteLegali");//add view - noteLegali.jsp  
        return mav;
    }
   
    @RequestMapping(value = "insertJdbcContact/", method = RequestMethod.GET)
    public ModelAndView insertContact() {
        ModelAndView mav = new ModelAndView("insertDataPage");
        //Dati bean = new Dati(); // crea il bean per la pagina insertJdbcContact
        //mav.addObject("d", d);
        mav.addObject("insertUser", d);
        return mav;
    }
    
    @RequestMapping(value = {"viewData/"}, method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView viewDataPost(
            //@ModelAttribute("insertUser") Dati userData
            ) {
        ModelAndView mav = new ModelAndView("viewDataPage");
        //String s = "altro contenuto prodotto dal controller...";
        //mav.addObject("frase", s);
        //mav.addObject("userData", d);
        // qui salvare i dati in DB. 
        //DBClasses dbc = new DBClasses();
        //String ris = dbc.storeUserData(userData);
        //mav.addObject("storageResult", ris);
        return mav;
    }
   
    @RequestMapping(value = {"index","/"}, method = {RequestMethod.GET})
    public String redirectIngHome(){
        return "redirect:index/";
    }
    
    @RequestMapping(value = {"azienda"}, method = {RequestMethod.GET})
    public String redirectAzienda(){
        return "redirect:azienda/";
    }
    
    @RequestMapping(value = {"note-legali"}, method = {RequestMethod.GET})
    public String redirectNotelegali(){
        return "redirect:note-legali/";
    }
/* NON USATO...
     * 
    @RequestMapping(value = "/insertJdbcContact", method = RequestMethod.POST)
    public ModelAndView insertContact2() {
        ModelAndView mav = new ModelAndView("insertDataPage");
        Dati bean = new Dati();// crea il bean per la pagina insertJdbcContact
        mav.addObject("insertUser", bean);
        mav.addObject("status", "success");
        return mav;
    }
    
    // non usato ...
    @RequestMapping(value = "/viewData", method = RequestMethod.GET)
    public ModelAndView viewDataGet() {
        ModelAndView mav = new ModelAndView("viewDataPage");
        Dati userData = new Dati();
        mav.addObject("insertUser", userData);
        mav.addObject("status", "success");
        return mav;
    }
*/
    @PostConstruct
    public void Init(){
        d = new Dati();
        try {
            DBController.registerDB();
        } catch (SQLException ex) {
            Logger.getLogger(PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
