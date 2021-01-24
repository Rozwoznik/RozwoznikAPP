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
        <a href="profil.jsp">Twój Profil</a>
        <a href="ogloszenia.jsp">Ogłoszenia</a>
        <% String userName = (String) request.getAttribute("userName");%>
        <a href="profil.jsp" style="float:right; "> Zalogowano  <%=userName%><br> </a>
        <a href="logout.jsp" style="float:right; "> Wyloguj <%=userName%><br> </a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form" action="AdvertisementServlet" method="get">

                <div class="container-login-form-btn m-t-20">
                    <button class="login-form-btn" type="submit" value="Login">
                        Wszystkie ogloszenia
                    </button>
                </div>
            </form>

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
                    <a href="addAdvertisement.jsp" class="login-form-btn">Wyszukaj</a>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
