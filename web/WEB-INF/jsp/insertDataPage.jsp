<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/stile.css"/>
        <title>Input your data</title>
    </head>
    <body>
        <div></div>
        <div class ="highlighted"></div>
        <div></div>
        <form:form commandName="insertUser" method="POST" action="viewData" id="userdetailsid" modelAttribute="insertUser" >        
            <fieldset>
                <legend>User details:</legend>
                <ol>
                    <li>
                        <label for=name>Name</label>
                        <form:input path="name"  type="text" />
                    </li>
                    <li>
                        <label for=name>Date</label>
                        <form:input path="dob" type="date" required="true"/>
                    </li>
                    <li>
                        <label for=email>Email</label>
                        <form:input path="email" type="text"/>
                    </li>
                </ol>
            </fieldset>
            <fieldset>
                <button type=submit>Save User Details!</button>
            </fieldset>
        </form:form>
    </body>
</html>
