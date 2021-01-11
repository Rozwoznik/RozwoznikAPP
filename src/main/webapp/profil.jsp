<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twój profil</title>
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


            <form class="login-form validate-form" action="UserDataServlet" method="post">
					<span class="login-form-title p-b-33">
						Co chcesz zrobić
					</span>

                <div class="container-login-form-btn m-t-20" type="submit" value="Login">
                    <button class="login-form-btn">
                        Twoje Dane
                    </button>
                </div>

                <div class="container-login-form-btn m-t-20">
                    <a href="addAddress.jsp" class="login-form-btn">Uzupelnij Adres</a>
                </div>

                <div class="container-login-form-btn m-t-20">
                    <a href="addAdvertisement.jsp" class="login-form-btn">Uzupelnij Dane</a>

                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
