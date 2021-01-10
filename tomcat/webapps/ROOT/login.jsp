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
    <link rel="stylesheet" href="CSS/main.css">
</head>
<body>

<div class="limiter">

    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="profil.jsp">Twój Profil</a>
        <a href="ogloszenia.jsp">Ogłoszenia</a>
        <a href="register.jsp" style="float:right; margin-right:50px;"> Zarejestruj Się </a>
        <a href="login.jsp" style="float:right; "> Zaloguj Się</a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form" action="Login" method="post">
					<span class="login-form-title p-b-33">
						Zaloguj
					</span>
                <div class="wrap-input ">
                    <input class="input" type="text" name="name" placeholder="email">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>

                <div class="wrap-input  ">
                    <input class="input" type="password" name="password" placeholder="password">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>


                <div class="container-login-form-btn m-t-20 " type="submit" value="Login">
                    <button class="login-form-btn">
                        Zatwierdź
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>

</body>
</html>
