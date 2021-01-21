<%--
  Created by IntelliJ IDEA.
  User: Kuczma
  Date: 21.01.2021
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyszukiwarka</title>
    <link rel="stylesheet" href="CSS/main.css">

</head>
<body>

<div class="limiter">
    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="#news">Twój Profil</a>
        <a href="#contact">Ogłoszenia</a>
        <a href="#about">Twoje Ogłoszenia</a>
        <a href="znajdzOgloszenie.html"> Znajdz ogłoszenie </a>


    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form" action="FindAdvertisement" method="post" autocomplete="off">
                    <span class="login-form-title p-b-33">
                        Przeszukaj ogloszenia
                    </span>

                <div class="wrap-input">
                    <select type="text" name="category">
                        <option value="0" >Wybierz Kategorię:</option>
                        <option value=1>Budowlane</option>
                        <option value="2">Jedzenie</option>
                        <option value="3">Motoryzacja</option>
                        <option value="4">Moda</option>
                        <option value="5">Sport</option>
                        <option value="6">Elektornika</option>
                    </select>
                </div>


                <div class="container-login-form-btn m-t-20">
                    <button class="login-form-btn" type="submit" value="wyszukaj">
                        Przeszukaj
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>
</body>
</html>
