<%--
  Created by IntelliJ IDEA.
  User: Tomasz
  Date: 10.01.2021
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <title>Welcome</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="CSS/main.css">

</head>
<body>

<div class="limiter">
    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="profil.jsp">Twój Profil</a>
        <a href="ogloszenia.jsp">Ogłoszenia</a>
        <%String userName="";%>

        <%Cookie ck[] = request.getCookies();%>
        <% userName = ck[2].getValue();%>

        <a href="profil.jsp" style="float:right; "> Zalogowano  <%=userName%><br> </a>
        <a href="logout.jsp" style="float:right; "> Wyloguj <%=userName%><br> </a>

    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="data-form validate-form" action="/UserDataServlet" method="post">
                    <span class="login-form-title p-b-33">
                       Witaj : <%=userName%><br>
                    </span>

            </form>
        </div>
    </div>
</div>




</body>
</html>
