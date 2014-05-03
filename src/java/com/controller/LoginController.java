/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.beans.WebAdmin;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sasha Alexandru Podgoreanu
 */
@Controller
public class LoginController {

    private WebAdmin userData;

    @RequestMapping(value = {"login/"}, method = RequestMethod.GET)
    public ModelAndView wellcome() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("webAdmin", userData);
        return mav;
    }

    @RequestMapping(value = {"login/enter"}, method = RequestMethod.POST)
    public ModelAndView enter(@ModelAttribute("webAdmin") WebAdmin webAdmin, HttpSession session) {
        webAdmin.authenticate();
        session.setAttribute("webAdminSession", webAdmin);
        ModelAndView mav = new ModelAndView("redirect:/login/");
        return mav;
    }
    
    @RequestMapping(value = {"login/logout"}, method = RequestMethod.POST)
    public ModelAndView logout(HttpSession session) {
        WebAdmin webAdminSession = (WebAdmin) session.getAttribute("webAdminSession");
        if(webAdminSession != null)
            webAdminSession.cleanUp(); //timeStamp to user lastlogin
        session.removeAttribute("webAdminSession");
        ModelAndView mav = new ModelAndView("redirect:/login/");
        return mav;
    }

    @RequestMapping(value = {"login"}, method = {RequestMethod.GET})
    public String redirectLogin() {
        return "redirect:login/";
    }

    @PostConstruct
    void Init() {
        userData = new WebAdmin();
        userData.setNome(null);

    }
}
