<%@ page import="Services.UserService" %>
<%@ page import="Model.User" %><%--
  Created by IntelliJ IDEA.
  User: Kuczma
  Date: 01.01.2021
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozwoźnik logowanie</title>
    <link rel="stylesheet" href="CSS/main.css">
</head>
<body>

<div class="limiter">

    <div class="topnav">
        <a class="active" href="#home">Strona Domowa</a>
        <a href="profil.jsp" >Twój Profil</a>
        <a href="ogloszenia.jsp">Ogłoszenia</a>
        <%String userName="";%>

        <%Cookie ck[] = request.getCookies();%>
        <% userName = ck[2].getValue();%>

        <a href="profil.jsp" style="float:right; "> Zalogowano  <%=userName%><br> </a>
        <a href="logout.jsp" style="float:right; "> Wyloguj <%=userName%><br> </a>
    </div>

    <div class="container-login">
        <div class="wrap-login p-l-55 p-r-55 p-t-65 p-b-50">
            <form class="login-form validate-form" action="LogoutServlet" method="get">
					<span class="login-form-title p-b-33">
						Czy chcesz się wylogować ?
					</span>


                <div class="container-login-form-btn m-t-20 " type="submit" value="Login">
                    <button class="login-form-btn">
                        Wyloguj się
                    </button>
                </div>

            </form>
        </div>
    </div>
</div>

</body>
</html>
