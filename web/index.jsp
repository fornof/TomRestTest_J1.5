<%-- 
    Document   : index
    Created on : Aug 8, 2014, 9:21:34 AM
    Author     : robert fornof
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Welcome to the demo.</h2>
        <a href ="./rest/hello/admin"> login as admin using basic authentication for rest service located at /rest/hello/admin </a>
        <a href ="./rest/hello/robert"> </br> login as robert using basic authentication for rest service located at /rest/hello/robert </a>
        </br><i>Note1 : you may need to clear your previous <a href ="https://support.mozilla.org/en-US/questions/939252">active logins</a>  if using BASIC login</i>
        </br><i>Note2 : make sure your conf/tomcat-users.xml is at least setup with an admin username - or whatever you are using for @RolesAllowed</i>
    </body>
</html>
