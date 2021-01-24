<%@ page import="Services.UserService" %>
<%@ page import="Model.User" %><%--
  Created by IntelliJ IDEA.
  User: Kuczma
  Date: 01.01.2021
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zaloguj się</title>
    <link rel="stylesheet" href="CSS/main.css">
</head>
<body>

<div class="limiter">

    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="nonLog.jsp.jsp" >Twój Profil</a>
        <a href="ogloszenia.jsp">Ogłoszenia</a>
        <a href="register.jsp" style="float:right; margin-right:50px;"> Zarejestruj Się </a>
        <a href="login.jsp" style="float:right; "> Zaloguj Się</a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form">
					<span class="login-form-title p-b-33">
						Aby przejsc dalej musisz byc zalogowany
					</span>
                <div class="container-login-form-btn m-t-20">
                    <a href="login.jsp" class="login-form-btn">Zaloguj sie</a>
                </div>

            </form>
        </div>
    </div>
</div>

</body>
</html>
