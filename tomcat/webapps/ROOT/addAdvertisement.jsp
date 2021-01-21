<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Ogłoszenie</title>
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
            <form class="login-form validate-form" action="addAdvertisement" method="post">
                    <span class="login-form-title p-b-33">
                        Wystaw Ogłoszenie
                    </span>

                <div class="wrap-input  ">
                    <input class="input" type="text" name="name" placeholder="Nazwa Produktu">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>

                <div class="wrap-input">
                    <select type="text" name="category">
                        <option value="0">Wybierz Kategorię:</option>
                        <option value="1">Jedzenie</option>
                        <option value="2">Artykuły Domowe</option>
                        <option value="3">Gwoździe</option>
                        <option value="4">Pączki</option>
                    </select>
                </div>


                <div class="wrap-input  ">
                    <input class="input" type="text" name="price" placeholder="Cena">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>

                <div class="wrap-input  ">
                    <input class="input" type="text" name="description" placeholder="Opis">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>



                <div class="container-login-form-btn m-t-20">
                    <button class="login-form-btn" type="submit" value="Dodaj">
                        Dodaj Ogłoszenie
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>


<form action="addAdvertisement" method="post">
    Nazwa produktu:<input type="text" name="name">
    Kategoria:<input type="text" name="category">
    Cena:<input type="text" name="price">
    Opis:<input type="text" name="description">

    <input type="submit" value="Dodaj">
</form>
</body>
</html>
