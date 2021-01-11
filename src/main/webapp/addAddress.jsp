<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Adres</title>
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
                <form class="login-form validate-form" action="AddAddressServlet" method="post">
						<span class="login-form-title p-b-33">
							Uzupelnij swój adres:
						</span>

                    <div class="wrap-input  ">
                        <input class="input" type="text" name="city" placeholder="Miasto">
                        <span class="focus-input-1"></span>
                        <span class="focus-input-2"></span>
                    </div>

                    <div class="wrap-input ">
                        <input class="input" type="text" name="street" placeholder="Ulica">
                        <span class="focus-input-1"></span>
                        <span class="focus-input-2"></span>
                    </div>

                    <div class="wrap-input  ">
                        <input class="input" type="text" name="houseNumber" placeholder="Nr domu/Mieszkania">
                        <span class="focus-input-1"></span>
                        <span class="focus-input-2"></span>
                    </div>

                    <div class="wrap-input  ">
                        < id="errorFirstNameMissing" style="visibility:hidden;">*Please provide your first
><br/>
                        <input class="input" type="text" name="zipCode" placeholder="Kod pocztowy">
                        <span class="focus-input-1"></span>
                        <span class="focus-input-2"></span>
                    </div>

                    <div class="container-login-form-btn m-t-20" type="submit" value="Login">
                        <button class="login-form-btn">
                            Zatwierdź
                        </button>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>
<div id="parent">
    <form id="form_login" action="RegisterServlet" method="post">
        Nazwa uzytkownika:<input type="text" name="nick"><br>
        Haslo:<input type="password" name="pass"><br>
        Powtorz haslo:<input type="password" name="repass"><br>
        Email:<input type="text" name="email"><br><br>
        <input class="blue_button" type="submit" value="Zarejestruj"><br>
        Masz konto? <a href="login.jsp">Zaloguj się!</a>
    </form>
</div>
</body>
</html>