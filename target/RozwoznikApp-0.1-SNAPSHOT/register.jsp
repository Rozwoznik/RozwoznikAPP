<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozwoźnik rejestracja</title>
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
        <a href="register.jsp" style="float:right; margin-right:50px;"> Zarejestruj Się </a>
        <a href="login.jsp" style="float:right; "> Zaloguj Się</a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form" action="RegisterServlet" method="post">
					<span class="login-form-title p-b-33">
						Rejestracja
					</span>
                <div class="wrap-input ">
                    <input class="input" type="text" name="nick" placeholder="Nazwa użytkownika">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>

                <div class="wrap-input  ">
                    <input class="input" type="password" name="pass" placeholder="Hasło">
                    <span class="focus-input-1"></span>
                    <span class="focus-input-2"></span>
                </div>

                <div class="wrap-input  ">
                <input class="input" type="password" name="repass" placeholder="Powtóra Hasło">
                <span class="focus-input-1"></span>
                <span class="focus-input-2"></span>
                 </div>

                <div class="wrap-input  ">
                    <input class="input" type="text" name="email" placeholder="Email">
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