<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/stile.css" />
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div class ="highlighted" ></div>
        <div></div>
        <div></div>
    <div id=prova">
        <p>Hello! This is the default welcome page for a 
            Spring Web MVC project...
            Info: <blockquote>${helloMessage}</blockquote>
        <img src="<%=request.getContextPath()%>/immagini/aaa.jpg">
        
        
    </div>
    <a href="<%=request.getContextPath()%>/insertJdbcContact/">Go to insertion page</a>
    
    <form:form commandName="index" method="GET" action="viewData" id="wellcomeid" modelAttribute="d" >        
            <fieldset>
                <button type=submit>GO ON!!</button>
            </fieldset>
    </form:form>
    <%= session.getAttribute("heloString") %>
    ${heloString}
</body>
</html>
