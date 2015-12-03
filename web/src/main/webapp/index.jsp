<%-- 
    Document   : index
    Created on : 03/12/2015, 09:11:12
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Média Aritmética</title>
        
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"> 
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body class="text-center">
        <br><br><br><br>
        <h1>Calcule sua média aritmética</h1>
        <br>
        <br>
        <div class="modal-dialog text-center form-group media-middle">
            <form method="post" action="media">
                <input class="btn btn-default" type="text" placeholder="Primeira nota" name="nota1"><br><br>
                <input class="btn btn-default" type="text" placeholder="Segunda nota" name="nota2"><br><br>
                <input class="btn btn-default" type="text" placeholder="Terceira nota" name="nota3"><br><br>
                <input class="btn btn-primary" type="submit" value="Calcular">
            </form>
        </div>
    </body>
</html>
