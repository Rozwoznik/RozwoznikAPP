<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Ogłoszenie</title>
    <link rel="stylesheet" href="CSS/main.css">

<<<<<<< HEAD
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datepicker({ dateFormat: 'dd-mm-yy' });
        } );
    </script>
=======
>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!
</head>
<body>

<div class="limiter">
    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
<<<<<<< HEAD
        <a href="ProfileServlet">Twój Profil</a>
        <a href="AdvertisementServlet">Ogłoszenia</a>
        <a href="#about">Twoje Ogłoszenia</a>
        <a href="FindAdvertisement.jsp"> Znajdz ogłoszenie </a>
=======
        <a href="#news">Twój Profil</a>
        <a href="#contact">Ogłoszenia</a>
        <a href="#about">Twoje Ogłoszenia</a>
        <a href="znajdzOgloszenie.html"> Znajdz ogłoszenie </a>
>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!


    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
<<<<<<< HEAD
            <form class="login-form validate-form" action="AddAdvertisement" method="post" autocomplete="off">
=======
            <form class="login-form validate-form" action="addAdvertisement" method="post">
>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!
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
                        <option value="0" >Wybierz Kategorię:</option>
<<<<<<< HEAD
                        <option value="1">Budowlane</option>
                        <option value="2">Jedzenie</option>
                        <option value="3">Motoryzacja</option>
                        <option value="4">Moda</option>
                        <option value="5">Sport</option>
                        <option value="6">Elektornika</option>
=======
                        <option value="1">Jedzenie</option>
                        <option value="2">Artykuły Domowe</option>
                        <option value="3">Gwoździe</option>
                        <option value="4">Pączki</option>
>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!
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

<<<<<<< HEAD
                <div class="wrap-input  ">
                    <input class="input" id="datepicker" type="text" name="datePicker" placeholder="Data zakonczenia aukcji">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>
=======

>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!

                <div class="container-login-form-btn m-t-20">
                    <button class="login-form-btn" type="submit" value="Dodaj">
                        Dodaj Ogłoszenie
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>
<<<<<<< HEAD
=======


<form action="addAdvertisement" method="post">
    Nazwa produktu:<input type="text" name="name">
    Kategoria:<input type="text" name="category">
    Cena:<input type="text" name="price">
    Opis:<input type="text" name="description">

    <input type="submit" value="Dodaj">
</form>
>>>>>>> 7cdc1a2... WERSJA POPRAWNA!!! KACPRZE Z PRZYSZŁOSĆI COFAJ SIĘ TU!!!
</body>
</html>
