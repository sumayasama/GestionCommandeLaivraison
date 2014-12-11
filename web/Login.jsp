<%-- 
    Document   : Login
    Created on : 15 mai 2014, 20:23:59
    Author     : sumaya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin access only</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body style="background: #daecee">
        <form method=post action="j_security_check" >
            <div style="text-align: center">
                <h1>Informations confidentielles</h1>
                <p>
      <span>adminstrateur id:</span>
      <br />
      <input type="text"  name= "j_username" >
    </p>
    <p>
      <span>mot de passe:</span>
      <br />
      <input type="password"  name= "j_password" >
    </p>
    <p>
      <input type="submit" value="Login">
    </p>
            </div>
  </form>
    </body>
</html>

   