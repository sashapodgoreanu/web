<%-- 
    Document   : login
    Created on : 30-apr-2014, 0.09.04
    Author     : Sasha Alexandru Podgoreanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <c:import url="template/head.jsp"/>
    </head>
    <body>
        <header>
            <c:import url="template/menu-nav.jsp"/>
        </header>
        <article class="container-fluid">
            <div class ="row">
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div class="panel panel-success" style="margin-top:100px">
                        <div class="panel-heading">Login</div>
                        <div class="panel-body">
                            <c:choose>
                                <c:when test = "${webAdminSession.nome == null || webAdminSession.valid == false}">   
                                    <form:form action="enter" modelAttribute="webAdmin" class="form-horizontal" role="form" method="POST">
                                        <div class="form-group">
                                            <label for="inputUser" class="col-sm-2 control-label">Utente</label>
                                            <div class="col-sm-10">
                                                <form:input path="login" type="text" class="form-control" id="inputUser" placeholder="Utente"/>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
                                            <div class="col-sm-10">
                                                <form:input path="password" type="password" class="form-control" id="inputPassword3" placeholder="Password"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <div class="checkbox">
                                                    <label>
                                                        <input type="checkbox"> Resta Collegato
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button id="accedi" type="submit" class="btn btn-default">Accedi</button>
                                            </div>
                                        </div>
                                        <c:if test = "${webAdminSession.valid == false}">
                                            <div class ="row">
                                                <div class="col-sm-2">
                                                </div>
                                                <div class="col-sm-10">
                                                    <p class="bg-danger text-center lead">La password o il nome utente inserito non è corretto</p>
                                                </div>
                                            </div>
                                        </c:if>
                                    </form:form>
                                </c:when>
                                <c:otherwise>
                                    <form:form action="logout"> 
                                        <div class="row">
                                            <p  class="col-sm-8 control-label">Sei logato come ${webAdminSession.nome}. Vuoi uscire?</p>
                                            <div class=" col-sm-4">
                                                <button id="esci" type="submit" class="btn btn-default">Esci</button>
                                            </div>
                                        </div> 
                                    </form:form>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                </div>
            </div>
        </article>
    </body>

</html>
