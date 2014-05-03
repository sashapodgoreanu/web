<%-- 
    Document   : index
    Created on : 22-feb-2014, 12.40.14
    Author     : Sasha Alexandru Podgoreanu
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="it">
    <head>
        <c:import url="template/head.jsp"/>
    </head>
    <body>
        <header class="applybackground_grey">
            <c:import url="template/menu-nav.jsp"/>
            <!-- Fotorama SlideShow: Add images to <div class="fotorama"></div>. -->
            <div class ="container-fluid">
                <div class="row">
                    <div class="col-md-1">
                    </div>
                    <div class="col-md-10">
                        <div class="fotorama"
                             data-fit="cover"
                             data-nav="false"
                             data-autoplay="true"
                             data-loop="true"
                             data-width="100%"
                             data-height="50%"               
                             data-direction="ltr">   <!-- Photos article text direction -->

                            <img src="${pageContext.request.getContextPath()}/immagini/test/1w.jpg" >
                            <img src="${pageContext.request.getContextPath()}/immagini/test/2w.jpg" >
                            <img src="${pageContext.request.getContextPath()}/immagini/test/2w.jpg" >
                        </div>
                    </div>
                    <div class="col-md-1">
                    </div>
                </div>
            </div>
        </header>
        <article class="container-fluid">
            <div class="row applybackground_grey">
                <div class="col-md-2">
                </div>
                <div class="col-md-8">
                    <h3 class="text-center lead">
                        Serve un'impresa edile? 
                        <span class="glyphicon glyphicon-home"></span> 
                        Devi ristrutturare?
                        <span class="glyphicon glyphicon-hand-right"></span>
                        Fai un Preventivo Online <br>
                        Ottieni un PREVENTIVO GRATUITO entro 48 ore!
                    </h3>
                </div>
                <div class="col-md-2">  
                </div>
            </div>
            <div class="row applybackground_grey">
                <div class="col-md-1">
                </div>
                <!-- Paneli Notizie-->
                <div class="col-md-8">
                    <article class="panel panel-default margin-20-top">
                        <section class="panel-heading"><h3>Ristrutturare casa: <small>guida agli incentivi</small></h3> </section>
                        <section class="panel-body leggitutto">
                            <h4 class="text-primary">RISTRUTTURAZIONI E DETRAZIONI</h4>
                            <h4 class ="text-info"><strong>Quanto puoi detrarre</strong></h4>
                            <p>È possibile detrarre dalle imposte della dichiarazione dei redditi una parte delle spese che hai sostenuto per ristrutturare casa.</p>
                            <ul>
                                <li>Per le spese sostenute prima del 25 giugno 2012 puoi detrarre il 36% della spesa, per un massimo di 48.000 euro.</li>
                                <li> Per le spese sostenute dal 26 giugno 2012 al 31 dicembre 2014 puoi detrarre il 50% della spesa per un massimo di 96.000 euro.<br></li>
                                <li>Per le spese sostenute dal 1° gennaio 2015 potrai detrarre il 40% della spesa sostenuta per un massimo di 96.000 euro.</li> 
                            </ul>
                            <h4 class ="text-info"><strong>Quali interventi sono detraibili?</strong></h4>
                            <ol>
                                <li>Interventi di manutenzione ordinaria</li>
                                <li>Interventi di manutenzione straordinaria</li>
                                <li>Ricostruzione dopo evento calamitoso</li>
                                <li>Eliminazione delle barriere architettoniche</li>
                            </ol>
                            <p class="text-muted"><small>articolo visto su <a href="http://www.altroconsumo.it">www.altroconsumo.it</a></small></p>
                        </section>
                    </article>
                </div>
                <!-- Paneli laterali destra-->
                <div class="col-md-3">
                    <div class="panel panel-default margin-20-top">
                        <div class="panel-heading">Le notizie più popolari</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                    <div class="panel panel-default margin-20-top">
                        <div class="panel-heading">Post in evidenza</div>
                        <div class="panel-body">
                            Panel content
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 applybackground">
                    Level 1: .col-md-9
                    <div class="row">
                        <div class="col-md-6">
                            Level 2: .col-md-6
                        </div>
                        <div class="col-md-6">
                            Level 2: .col-md-6
                        </div>
                    </div>
                </div>
            </div>
        </article>

        <script src="${pageContext.request.getContextPath()}/js/readmore.js"></script>
        <!--ReadMore-->
        <script>
            $('.leggitutto').readmore({maxHeight: 240});
        </script>
    </body>
</html>