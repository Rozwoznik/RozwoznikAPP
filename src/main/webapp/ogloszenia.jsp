<%@ page import="Services.AdvertisementService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ogloszenia</title>
    <link rel="stylesheet" href="CSS/main.css">
</head>
<body>

<div class="limiter">

    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="#news">Twój Profil</a>
        <a href="#contact">Ogłoszenia</a>
        <a href="znajdzOgloszenie.html"> Znajdz ogłoszenie </a>
        <a href="znajdzOgloszenie.html" style="float:right; margin-right:50px;"> Zarejestruj Się </a>
        <a href="znajdzOgloszenie.html" style="float:right; "> Zaloguj Się</a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form">
					<span class="login-form-title p-b-33">
						Co chcesz zrobić
					</span>

                <div class="container-login-form-btn m-t-20">
                    <a href="#none" class="login-form-btn">Moje Ogloszenia</a>

                </div>

                <div class="container-login-form-btn m-t-20">
                    <a href="addAdvertisement.jsp" class="login-form-btn">Dodaj Ogloszenie</a>
                </div>

                <div class="container-login-form-btn m-t-20">
                    <a href="FindAdvertisement.jsp" class="login-form-btn">Przeszukaj oferty</a>
                </div>

                    <a href="addAdvertisement.jsp" class="login-form-btn">Wyszukaj</a>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
