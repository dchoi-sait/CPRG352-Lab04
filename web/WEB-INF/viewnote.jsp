<%-- 
    Document   : viewnote
    Created on : Oct 5, 2021, 8:38:36 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>

        <p><b>Title:</b> <span>${note.title}</span></p>
        <span><b>Contents:</b></span>
        </br>
        <span>${note.content}</span>
        </br>
        </br>

        <a href="note?edit">Edit</a>
    </body>
</html>
