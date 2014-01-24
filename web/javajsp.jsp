<%-- 
    Document   : javajsp
    Created on : Jan 24, 2014, 11:12:34 AM
    Author     : Michele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css"/>
        <title>Java Links</title>
    </head>
    <body class="body">
        <div id="container" class="container" >
            <div id="header"  class="header">
                </div>
             <div id="titleBar" class="titleBar">
                <p>Programming Resources</p>
            </div>     
                    <div id="content" class="content">
                        
                        <%
                        String message = (String)request.getAttribute("message");
                        out.print("<p>"+message+"</p>");
                        %>
                        <a href="http://docs.oracle.com/javase/7/docs/api/">Java 7 API</a><br>
                        <a href="http://docs.oracle.com/javaee/7/api/">Java EE 7 API</a><br> 
                        <a href="http://www.joda.org/joda-time/">Joda Time</a><br> 
                       <a href="http://getbootstrap.com/">BootStrap</a><br> 
                        <a href="http://www.jboss.org/overview/">JBoss</a><br> 
                        
                    </div>
            <div id="footer"  class="footer">
                </div>
            
        </div>              
        </body>
</html>
