<%--
  Created by IntelliJ IDEA.
  User: Kuczma
  Date: 01.01.2021
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozwoźnik logowanie</title>
    <link rel="stylesheet" href="CSS/loginForm.css">
</head>
<body>
    <div id="parent">
        <form id="form_login" action="Login" method="post">
            Nazwa uzytkownika:<input type="text" name="name"><br>
            Haslo:<input type="password" name="password"><br><br>
            <input class="blue_button" type="submit" value="Login"><br>
            Nie masz konta? <a href="register.jsp">Zaloz je!</a>
        </form>
    </div>
</body>
</html>
