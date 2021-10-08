<%-- 
    Document   : editnote
    Created on : Oct 5, 2021, 8:38:50 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form method="POST">
            <label><b>Title:</b> </label> 
            <input type="text" name="n_title" value="${note.title}">
            </br>
            <label><b>Contents:</b></label>
            <textarea name="n_contents">${note.content}</textarea>   
            </br>

            </br>
            </br>
            <input type="submit" value="save">
        </form>

    </body>
</html>
