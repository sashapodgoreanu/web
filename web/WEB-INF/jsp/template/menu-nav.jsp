<%-- 
    Document   : menu-nav
    Created on : 30-apr-2014, 22.34.50
    Author     : Sasha Alexandru Podgoreanu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<nav class="navbar navbar-default" role="navigation" >
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://www.damicicostruzioni.it">Damici Ristrutturazioni</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li
                    <c:choose>
                        <c:when test = "${fn:startsWith(pageContext.request.getAttribute('javax.servlet.forward.request_uri'), '/index/')}">
                            class="active"
                        </c:when>
                    </c:choose>
                    ><a href="${pageContext.request.getContextPath()}/index/">Home</a></li>
                <li
                    <c:choose>
                        <c:when test = "${fn:startsWith(pageContext.request.getAttribute('javax.servlet.forward.request_uri'), '/azienda/')}">
                            class="active"
                        </c:when>
                    </c:choose>
                    ><a href="${pageContext.request.getContextPath()}/azienda/">Azienda</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">I nostri servizi <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Decorazioni interni</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Ristrutturazioni Cucina</a></li>
                        <li><a href="#">Ristrutturazioni Bagno</a></li>
                        <li><a href="#">Ristrutturazioni Appartamenti</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Ristrutturazioni Uffici e<br> locali commerciali</a></li>
                        <li><a href="#">Ristrutturazioni Condomini</a></li>
                    </ul>
                </li>
                <li><a href="#">Testimonianze</a></li>
                <li>
                    <p class="container-fluid margin-6-top"> 
                        <button type="button" class="btn btn-info">Preventivo Online <span class="glyphicon glyphicon-star"></span>
                        </button>
                    </p>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="social">
                    <a href="https://www.facebook.com/damiciistrutturazioni">f</a> 
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Informazioni<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Mappa del Sito</a></li>
                        <li><a href="${pageContext.request.getContextPath()}/note-legali/">Note legali/Privacy</a></li>
                        <li><a href="${pageContext.request.getContextPath()}/login/">Login</a></li>
                        <li class="divider"></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
