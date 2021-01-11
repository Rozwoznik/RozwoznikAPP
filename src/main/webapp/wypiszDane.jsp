<%--
  Created by IntelliJ IDEA.
  User: Tomasz
  Date: 10.01.2021
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <title>Login </title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
            <form class="data-form validate-form" action="/UserDataServlet" method="post">
                    <span class="login-form-title p-b-33">
                       Twoje Dane :
                    </span>

                <% String street = (String) request.getAttribute("street");%>
                <% String houseNumber = (String) request.getAttribute("houseNumber");%>
                <% String zipCode = (String) request.getAttribute("zipCode");%>
                <% String city= (String) request.getAttribute("city");%>
                <% String validAddress= (String) request.getAttribute("validAddress");%>


                <% String validData= (String) request.getAttribute("validData");%>
                <% String name = (String) request.getAttribute("name");%>
                <% String sourname = (String) request.getAttribute("sourname");%>

                <span class="login-form-title p-b-33">
                <%=validData%>
                Imię : <%=name%><br>
                Nazwisko : <%=sourname%><br><br>

                <%=validAddress%><br>
                Miasto: <%=city%><br>
                Ulica : <%=street%><br>
                Nr Domu : <%=houseNumber%><br>
                Kod pocztowy : <%=zipCode%><br>


            </span>




            </form>
        </div>
    </div>
</div>




</body>
</html>
